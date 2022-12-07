package com.jean.mei.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jean.mei.entities.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
		
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> list() {
		
		Categoria cat1 = new Categoria(1, "ELETRONICA");
		Categoria cat2 = new Categoria(2, "Eletrica");
		Categoria cat3 = new Categoria(3, "Mecanica");
		Categoria cat4 = new Categoria(4, "Informática");
		List<Categoria> list = new ArrayList<Categoria>();
		list.add(cat1);
		list.add(cat2);
		list.add(cat3);
		list.add(cat4);
		return list;
	}

}
