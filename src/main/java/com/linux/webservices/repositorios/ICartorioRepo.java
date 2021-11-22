package com.linux.webservices.repositorios;

import com.linux.webservices.models.Cartorio;
import com.linux.webservices.models.CartorioCertidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartorioRepo extends JpaRepository<Cartorio, String> {
   
   @Query("SELECT cart FROM Cartorio cart WHERE LOWER(cart.name) = ?1 ")
   public Cartorio findByName(String name);

}
