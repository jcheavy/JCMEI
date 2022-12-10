package com.jean.mei;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jean.mei.entities.Categoria;
import com.jean.mei.entities.Produto;
import com.jean.mei.repositories.CategoriaRepository;
import com.jean.mei.repositories.ProdutoRepository;

@SpringBootApplication
public class MeiApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repo;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MeiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categoria cat1 = new Categoria(null, "ELETRONICA");
		 Categoria cat2 = new Categoria(null, "Eletrica");
		 Categoria cat3 = new Categoria(null, "Mecanica");
		 Categoria cat4 = new Categoria(null, "Informática");
		 
		 Produto p1 = new Produto(null, "Computador", 2.100);
		 Produto p2 = new Produto(null, "Impressora", 1.200);
		 Produto p3 = new Produto(null, "Monitor", 0.900);
		 
		 cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		 cat2.getProdutos().addAll(Arrays.asList(p2));
		 
		 p1.getCategorias().addAll(Arrays.asList(cat1));
		 p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		 p3.getCategorias().addAll(Arrays.asList(cat1));
		 
		 repo.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		 produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
