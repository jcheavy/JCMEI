package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
