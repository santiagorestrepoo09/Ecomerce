package com.ecommerce_Blossom.ecomerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_Blossom.ecomerce.model.Pedidos;

public interface PedidoRepository extends JpaRepository<Pedidos, Integer> {

	List<Pedidos> findByUsuarioId(Long usuarioId);
}
