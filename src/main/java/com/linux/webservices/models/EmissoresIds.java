package com.linux.webservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmissoresIds implements Serializable {
   
   @NotNull
   private String cartorio_uuid;
   
   @NotNull
   private String certidoes_uuid;
   
   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null)
         return false;
      if (getClass() != o.getClass())
         return false;
      EmissoresIds emissoresIds = (EmissoresIds) o;
      return Objects.equals(cartorio_uuid, emissoresIds.cartorio_uuid)
            && Objects.equals(certidoes_uuid, emissoresIds.certidoes_uuid);
   }
   
   @Override
   public int hashCode ( ) {
      return super.hashCode( );
   }
}
