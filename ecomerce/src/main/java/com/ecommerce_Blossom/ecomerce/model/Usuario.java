package com.ecommerce_Blossom.ecomerce.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table( name = "usuarios")
@SequenceGenerator(name = "usuarios_id_seq", sequenceName = "usuarios_id_seq", allocationSize = 1)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios_id_seq")
	private Long  id;
	private int cedula;
	private String nombre;
	private String apellido;
	private String email;
	private java.time.LocalDate fecha_registro;
	private String contraseña;
	
	public Usuario() {
		
	}
	
	public Usuario(Long id, int cedula, String nombre, String apellido, String email, LocalDate fecha_registro,
			String contraseña) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha_registro = fecha_registro;
		this.contraseña = contraseña;
	}



	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (long) id;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.time.LocalDate getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(java.time.LocalDate fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	
}
