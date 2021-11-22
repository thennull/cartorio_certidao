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
@Table(name = "certidoes")
public class Certidao {
   
   @Id
   @Column(updatable = false, nullable = false)
   private String uuid;
   
   private Integer code;
   
   private String name;
}
