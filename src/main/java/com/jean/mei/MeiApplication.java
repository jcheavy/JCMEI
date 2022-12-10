package com.jean.mei;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jean.mei.entities.Categoria;
import com.jean.mei.repositories.CategoriaRepository;

@SpringBootApplication
public class MeiApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MeiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Categoria cat1 = new Categoria(null, "ELETRONICA");
		 Categoria cat2 = new Categoria(null, "Eletrica");
		 Categoria cat3 = new Categoria(null, "Mecanica");
		 Categoria cat4 = new Categoria(null, "Informática");
		 
		 repo.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
	}

}
