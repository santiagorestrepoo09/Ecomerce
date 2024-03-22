package com.ecommerce_Blossom.ecomerce.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_Blossom.ecomerce.model.Productos;
import com.ecommerce_Blossom.ecomerce.service.ProductoService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping ("/productos")
public class ProductosRest {

	
	@Autowired
	private ProductoService productoService;
	
		
	@GetMapping
	private ResponseEntity<List<Productos>> getAllProductos () {
		List<Productos>  Productos = productoService.findAll();
		return ResponseEntity.ok(Productos);
	}
	
	@GetMapping("/{}/")
	private ResponseEntity<Optional<Productos>> infoProductos(@PathParam("id") Integer id){
		return ResponseEntity.ok(productoService.findById(id));
	}
	
	
	@PostMapping("/editar/")
	private ResponseEntity<?> update (@RequestBody Productos productos){
		try {
			Productos UsuarioGuardada = productoService.save(productos);	 
			return ResponseEntity.created(new URI("/Productos/" + UsuarioGuardada.getId())).body(UsuarioGuardada);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping("/nuevo/")
	private ResponseEntity<?> save (@RequestBody Productos productos){
		try {
			Productos UsuarioGuardada = productoService.save(productos);	 
			return ResponseEntity.created(new URI("/Productos/" + UsuarioGuardada.getId())).body(UsuarioGuardada);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/delete/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
		System.out.println("llege a borrar a = " + id);
		productoService.eliminarProductosPorId(id);
    }
	
}
