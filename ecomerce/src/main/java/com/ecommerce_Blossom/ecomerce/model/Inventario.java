package com.ecommerce_Blossom.ecomerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table( name = "inventarios")
public class Inventario {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Productos producto_id;
	

	public Inventario() {
	}
	
	public Inventario(int cantidad, Productos producto_id) {
		super();
		this.cantidad = cantidad;
		this.producto_id = producto_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Productos getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Productos producto_id) {
		this.producto_id = producto_id;
	}
	
}
