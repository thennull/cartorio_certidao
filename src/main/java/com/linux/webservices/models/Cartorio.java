package com.linux.webservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartorio")
public class Cartorio {
   
   private String name;
   
   private String address;
   
   private String city;
   
   private String state;
   
   @Id
   @Column(updatable = false, nullable = false)
   private String uuid;
}
