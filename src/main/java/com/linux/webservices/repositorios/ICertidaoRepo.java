package com.linux.webservices.repositorios;

import com.linux.webservices.models.Certidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICertidaoRepo extends JpaRepository<Certidao, String> {
   @Query("SELECT cert FROM Certidao cert WHERE LOWER(cert.name) = ?1 ")
   public Certidao findByName( String name);
}
