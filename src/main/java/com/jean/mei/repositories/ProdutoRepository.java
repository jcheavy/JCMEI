package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
