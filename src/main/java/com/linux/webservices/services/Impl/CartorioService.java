package com.linux.webservices.services.Impl;

import com.linux.webservices.models.Cartorio;
import com.linux.webservices.models.CartorioCertidao;
import com.linux.webservices.repositorios.ICartorioCertidaoRepo;
import com.linux.webservices.repositorios.ICartorioRepo;
import com.linux.webservices.services.CommonApiInterface;
import com.linux.webservices.services.ICartorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartorioService implements CommonApiInterface, ICartorioService {
   
   @Autowired
   private ICartorioRepo cartorioRepo;
   
   @Autowired
   private ICartorioCertidaoRepo cartorioCertidaoRepo;
   
   @Override
   public Cartorio fetchOne ( String name ) {
      return cartorioRepo.findByName( name );
   }
   
   @Override
   public Object saveOne ( Object o ) {
      if(o instanceof Cartorio){
         return cartorioRepo.saveAndFlush( (Cartorio) o);
      } else {
         return false;
      }
   }
   
   @Override
   public List<Cartorio> fetchAll ( ) {
      return cartorioRepo.findAll();
   }
   
   @Override
   public List<CartorioCertidao> fullInfoCartorio () {
      return cartorioCertidaoRepo.getFullCartorio();
   }
   
}
