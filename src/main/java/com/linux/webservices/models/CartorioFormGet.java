package com.linux.webservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartorioFormGet {
   
   private Cartorio cartorio;
   
   private List<String> certidoesList;
}
