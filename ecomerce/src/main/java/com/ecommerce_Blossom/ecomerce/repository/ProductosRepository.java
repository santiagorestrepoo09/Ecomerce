package com.ecommerce_Blossom.ecomerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_Blossom.ecomerce.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

	List<Productos> findByNombre(String nombre);

	List<Productos> findByPrecioBetween(Double precioMin, Double precioMax);

	List<Productos> findByCategoria(String categoria);

	
}
