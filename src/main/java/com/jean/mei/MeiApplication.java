package com.jean.mei;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jean.mei.entities.Categoria;
import com.jean.mei.entities.Cidade;
import com.jean.mei.entities.Estado;
import com.jean.mei.entities.Produto;
import com.jean.mei.repositories.CategoriaRepository;
import com.jean.mei.repositories.CidadeRepository;
import com.jean.mei.repositories.EstadoRepository;
import com.jean.mei.repositories.ProdutoRepository;

@SpringBootApplication
public class MeiApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repo;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	
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
		 

			Estado est1 = new Estado(null, "Minas Gerais");
			Estado est2 = new Estado(null, "São Paulo");

			Cidade c1 = new Cidade(null, "Uberlândia", est1);
			Cidade c2 = new Cidade(null, "São Paulo", est2);
			Cidade c3 = new Cidade(null, "Campinas", est2);
			
			est1.getCidades().addAll(Arrays.asList(c1));
			est2.getCidades().addAll(Arrays.asList(c2, c3));
			
			estadoRepository.saveAll(Arrays.asList(est1, est2));			
			cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
	}

}
