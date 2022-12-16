package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
