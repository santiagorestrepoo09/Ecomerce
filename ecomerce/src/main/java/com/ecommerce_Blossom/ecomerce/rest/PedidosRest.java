package com.ecommerce_Blossom.ecomerce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_Blossom.ecomerce.model.Pedidos;
import com.ecommerce_Blossom.ecomerce.service.PedidosService;

@RestController
@RequestMapping ("/pedidos")
public class PedidosRest {
	
	@Autowired
	private PedidosService pedidosService;
	
	@GetMapping
	private ResponseEntity<List<Pedidos>> getAllPedidos(){
		return ResponseEntity.ok(pedidosService.findAll());
	}
	
	//Taer todos los parametros
	@GetMapping(value = "/all")
	public List<Pedidos> getAll() {
		return pedidosService.findAll();
	}

	
}
