package com.ecommerce_Blossom.ecomerce.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table( name = "productos")
@SequenceGenerator(name = "productos_id_seq", sequenceName = "productos_id_seq", allocationSize = 1)
public class Productos {
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productos_id_seq")
	private Long  id;
	private String nombre;
	private java.time.LocalDate fecha_registro;
	private String descripcion;
	private int precio;
	private String categoria;
	
	public Productos() {
	}
	
	
	public Productos(Long id, String nombre, LocalDate fecha_registro, String descripcion, int precio,
			String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (long) id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public java.time.LocalDate getFecharegistro() {
		return fecha_registro;
	}
	public void setFecharegistro(java.time.LocalDate fecharegistro) {
		this.fecha_registro = fecharegistro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
