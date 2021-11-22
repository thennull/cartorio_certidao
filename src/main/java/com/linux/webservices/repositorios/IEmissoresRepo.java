package com.linux.webservices.repositorios;

import com.linux.webservices.models.Emissores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IEmissoresRepo extends JpaRepository<Emissores, Serializable> {
}
