package com.linux.webservices.controller;

import com.linux.webservices.models.Cartorio;
import com.linux.webservices.models.CartorioCertidao;
import com.linux.webservices.models.CartorioFormGet;
import com.linux.webservices.services.Impl.CartorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;


@Controller
public class CartorioController {
   
   @Autowired
   private CartorioService cartorioService;
   
   @GetMapping(path = "/")
   public String getAll(Model model){
      List<CartorioCertidao> allCartorioCertidao = cartorioService.fullInfoCartorio();
      Map<String, CartorioFormGet> cartorioMap = new HashMap<>(  );
      
      for(CartorioCertidao items: allCartorioCertidao){
         String key = "key_" + items.getCartorios();
         if(cartorioMap.containsKey( key )) {
            CartorioFormGet cartorioItem = cartorioMap.get( key );
            cartorioItem.getCertidoesList().add( items.getCertidoes( ) );
         } else {
            Cartorio cartorio = new Cartorio( );
            cartorio.setName( items.getCartorios( ) );
            cartorio.setAddress( items.getAddress( ) );
            cartorio.setState( items.getState( ) );
            cartorio.setCity( items.getCity( ) );
            
            List<String> certidao = new ArrayList( );
            certidao.add( items.getCertidoes( ) );
            
            cartorioMap.put( key, new CartorioFormGet( cartorio, certidao ) );
         }
      }
      return "home";
   }

   @GetMapping(path = "/addCartorio")
   public String addCartorio(Model model){
      model.addAttribute("cartorioForm", new Cartorio());
      return "cartorios";
   }

   @PostMapping("/addCartorio")
   public RedirectView createCartorio( @ModelAttribute("cartorioForm") Cartorio formPost) {
      System.out.println("Result here: " + formPost );
      return new RedirectView( "/" );
   }

   @GetMapping(path = "/updateCartorio/{name}")
   public String updateCartorio(Model model, @PathVariable String name ){
      Cartorio cartorio = new Cartorio(name, "Rua", "Ita", "Minas", null);
      model.addAttribute("cartorioForm", cartorio);
      return "updateCartorio";
   }
}
