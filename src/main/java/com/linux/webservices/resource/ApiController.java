package com.linux.webservices.resource;

import com.linux.webservices.models.Cartorio;
import com.linux.webservices.models.CartorioCertidao;
import com.linux.webservices.models.Certidao;
import com.linux.webservices.services.Impl.CartorioService;
import com.linux.webservices.services.Impl.CertidoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {
   
   @Autowired
   private CartorioService cartorioService;
   
   @Autowired
   private CertidoesService certidoesService;
   
   @GetMapping(path = "cartorios")
   public List<Cartorio> allCartorios () {
      return cartorioService.fetchAll();
   }
   
   @GetMapping(path = "certidoes")
   public List<Certidao> allCertidoes () {
      return certidoesService.fetchAll();
   }
   
   @GetMapping(path = "certidoes/{name}")
   public Certidao oneCertidao (@PathVariable String name) {
      return certidoesService.fetchOne( name.toLowerCase() );
   }
   
   @GetMapping(path = "cartorios/{name}")
   public Cartorio oneCartorio ( @PathVariable String name ) {
      return cartorioService.fetchOne( name.toLowerCase() );
   }
   
   @GetMapping(path = "cartorios/all")
   public List<CartorioCertidao> fullCartorioInfo () {
      return cartorioService.fullInfoCartorio();
   }
   
   @PostMapping(path = "cartorios")
   public Object createCartorio ( @RequestBody Cartorio newCartorio ){
      if(this.oneCartorio( newCartorio.getName( )) != null){
         return false;
      }
      newCartorio.setUuid( UUID.randomUUID().toString() );
      return cartorioService.saveOne( newCartorio );
   }
   
   @PutMapping(path = "cartorios/{name}")
   public Object updateCartorio (@RequestBody Cartorio updateCartorio, @PathVariable String name) throws InvocationTargetException, IllegalAccessException {
      
      Cartorio localCartorio = this.oneCartorio( name );
      
      if(localCartorio == null){
         return false;
      }
      
      if(updateCartorio.getName() != null){
         updateCartorio.setName( null );
      }
      
      List<Method> methods = Arrays.asList( updateCartorio.getClass().getMethods());
      HashMap<String, Object> updateValues = new HashMap<>(  );
      
      for(Method item: methods){
         if(item.getName().startsWith( "get" ) && item.invoke( updateCartorio ) != null && item.getName() != "getClass"){
            updateValues.put( item.getName().replace( "get", "set" ), item.invoke( updateCartorio ) );
         }
      }
      
      for(Method item: methods){
         if(updateValues.get( item.getName() ) != null){
            item.invoke( localCartorio, updateValues.get( item.getName() ) );
         }
      }
      return cartorioService.saveOne( localCartorio );
   }
   
   @DeleteMapping(path = "cartorios/{name}")
   public boolean deleteCartorio (@PathVariable String name) {
      return false;
   }
}
