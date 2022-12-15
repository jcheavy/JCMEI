package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
