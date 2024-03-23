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
	@JoinColumn(name = "id_producto")
	private Productos producto;
	

	public Inventario() {
	}


	public Inventario(int id, int cantidad, Productos producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.producto = producto;
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


	public Productos getProducto() {
		return producto;
	}


	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	
	
}
