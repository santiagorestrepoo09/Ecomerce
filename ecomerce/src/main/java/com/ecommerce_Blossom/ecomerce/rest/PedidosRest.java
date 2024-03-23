package com.ecommerce_Blossom.ecomerce.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/buscar/{id}")
    public Pedidos obtenerPedidosPorId(@PathVariable Integer id) {
        Optional<Pedidos> PedidosOptional = pedidosService.buscarPorId(id);
        return PedidosOptional.orElse(null); 
    }
	
	@GetMapping("/usuarios/{id}/pedidos")
	public ResponseEntity<List<Pedidos>> obtenerHistorialPedidosUsuario(@PathVariable Long id) {
	    List<Pedidos> historialPedidos = pedidosService.obtenerHistorialPedidosUsuario(id);
	    return ResponseEntity.ok(historialPedidos);
	}
	
	@PostMapping("/GuardarPedido")
    public ResponseEntity<Pedidos> crearPedido(@RequestBody Pedidos Pedidos) {
		Pedidos pedidoGuardado = pedidosService.guardarPedido(Pedidos);
        return new ResponseEntity<>(pedidoGuardado, HttpStatus.CREATED);
    }
	
	@PostMapping("/GuardarMultiplesPedidos")
	private ResponseEntity<String> guardarPedidos(@RequestBody List<Pedidos> pedidos) {
			pedidosService.guardarPedidos(pedidos);
	        return ResponseEntity.ok("Pedidos guardados exitosamente");
					
	}
	



	
}
