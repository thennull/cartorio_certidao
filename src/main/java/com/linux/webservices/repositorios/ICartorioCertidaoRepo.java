package com.linux.webservices.repositorios;

import com.linux.webservices.models.CartorioCertidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICartorioCertidaoRepo extends JpaRepository<CartorioCertidao, String> {
   
   @Query(value = "SELECT cart.name as cartorios, cart.address as address, cart.city as city, cart.state as state, cert.name as certidoes FROM Emissores em JOIN Cartorio cart" +
         " ON cart.uuid = em.cartorio_uuid JOIN Certidoes cert ON cert.uuid = em.certidoes_uuid", nativeQuery = true)
   public List<CartorioCertidao> getFullCartorio();
}
