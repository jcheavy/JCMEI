package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
