package com.linux.webservices.services.Impl;

import com.linux.webservices.models.Certidao;
import com.linux.webservices.repositorios.ICertidaoRepo;
import com.linux.webservices.services.CommonApiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertidoesService implements CommonApiInterface {
   
   @Autowired
   private ICertidaoRepo certidaoRepo;
   
   @Override
   public List fetchAll ( ) {
      return certidaoRepo.findAll();
   }
   
   @Override
   public Certidao fetchOne ( String name ) {
      return certidaoRepo.findByName( name.toLowerCase() );
   }
   
   @Override
   public Object saveOne ( Object o ) {
      if(o instanceof Certidao ){
         return certidaoRepo.saveAndFlush( (Certidao) o );
      } else {
         return false;
      }
   }
}
