package com.linux.webservices.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "emissores")
@IdClass( EmissoresIds.class )
public class Emissores {
   
   @Id
   @Column(updatable = false, nullable = false)
   private String cartorio_uuid;
   
   @Id
   @Column(updatable = false, nullable = false)
   private String certidoes_uuid;

}
