package com.ecommerce_Blossom.ecomerce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_Blossom.ecomerce.model.Inventario;
import com.ecommerce_Blossom.ecomerce.service.InventarioService;

@RestController
@RequestMapping ("/inventarios")
public class InventarioRest {
	
	@Autowired
	private InventarioService inventarioService;
	
	@GetMapping
	private ResponseEntity<List<Inventario>> getAllInventarios(){
		return ResponseEntity.ok(inventarioService.findAll());
	}
}
