package com.ecommerce_Blossom.ecomerce.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "pedidos")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private java.time.LocalDate fecha;
	private String cliente_nombre;
	private String estado;
	private int cantidad;
	private int precio_unitario;
	@ManyToOne
	
	@JoinColumn(name = "producto_id")
	private Productos producto_id;

	
	public Pedidos() {
	}


	public Pedidos(int id, LocalDate fecha, String cliente_nombre, String estado, int cantidad, int precio_unitario,
			Productos producto_id) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente_nombre = cliente_nombre;
		this.estado = estado;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.producto_id = producto_id;
	}


	public java.time.LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getCliente_nombre() {
		return cliente_nombre;
	}


	public void setCliente_nombre(String cliente_nombre) {
		this.cliente_nombre = cliente_nombre;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getPrecio_unitario() {
		return precio_unitario;
	}


	public void setPrecio_unitario(int precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	public Productos getProducto_id() {
		return producto_id;
	}


	public void setProducto_id(Productos producto_id) {
		this.producto_id = producto_id;
	}
	
	
	
	
}
