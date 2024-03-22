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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_Blossom.ecomerce.model.Productos;
import com.ecommerce_Blossom.ecomerce.model.Usuario;
import com.ecommerce_Blossom.ecomerce.service.UsusarioService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping ("/usuarios/")
public class UsuarioRest {
	
	@Autowired
	private UsusarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios () {
		List<Usuario>  usuarios = usuarioService.findAll();
		return ResponseEntity.ok(usuarios);
	}
	
	@GetMapping("/{}/")
	private ResponseEntity<Optional<Usuario>> infousuario(@PathParam("id") Integer id){
		return ResponseEntity.ok(usuarioService.findById(id));
	}
	
	
	@PostMapping("/editar/")
	private ResponseEntity<?> update (@RequestBody Usuario usuario){
		try {
			Usuario UsuarioGuardada = usuarioService.save(usuario);	 
			return ResponseEntity.created(new URI("/Usuario/" + UsuarioGuardada.getId())).body(UsuarioGuardada);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        if (usuarioService.autenticar(usuario.getUsername(), usuario.getContraseña())) {
            return "Inicio de sesión exitoso";
        } else {
            return "Nombre de usuario o contraseña incorrectos";
        }
    }
	
	
	
	@PostMapping("/nuevo/")
	private ResponseEntity<?> save (@RequestBody Usuario usuario){
		try {
			Usuario UsuarioGuardada = usuarioService.save(usuario);	 
			return ResponseEntity.created(new URI("/Usuario/" + UsuarioGuardada.getId())).body(UsuarioGuardada);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/delete/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
		System.out.println("llege a borrar a = " + id);
        usuarioService.eliminarUsuarioPorId(id);
    }
	
	
	
}
