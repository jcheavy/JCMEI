package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Pagamento;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
