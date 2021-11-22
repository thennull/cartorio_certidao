package com.linux.webservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartorioCertidao {

   @Id
   private String cartorios;
   
   private String address;
   
   private String city;
   
   private String state;
   
   private String certidoes;
   
}
