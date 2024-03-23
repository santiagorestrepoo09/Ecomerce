package com.ecommerce_Blossom.ecomerce.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table( name = "pedidos")
@SequenceGenerator(name = "pedidos_id_seq", sequenceName = "pedidos_id_seq", allocationSize = 1)
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedidos_id_seq")
	private Integer id;
	private java.time.LocalDate fecha;
	private String estado;
	private Integer cantidad;
	private Integer precio_unitario;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Productos producto;
	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private Usuario usuario;

	public Pedidos() {
	}

	public Pedidos(Integer id, LocalDate fecha, String estado, Integer cantidad, Integer precio_unitario,
			Productos producto, Usuario usuario) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.estado = estado;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.producto = producto;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(Integer precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	



	
	
}
