package com.ecommerce_Blossom.ecomerce.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.ecommerce_Blossom.ecomerce.model.Pedidos;
import com.ecommerce_Blossom.ecomerce.repository.PedidoRepository;

@Service
public class PedidosService implements PedidoRepository {
	
	@Autowired
	private PedidoRepository pedidoRepository;

		
	@Override
	public List<Pedidos> findAll() {
		return pedidoRepository.findAll();
	}
	
	public Optional<Pedidos> buscarPorId(Integer id) {
		return pedidoRepository.findById(id);
	}
	
	public List<Pedidos> obtenerHistorialPedidosUsuario(Long idUsuario) {
	    return pedidoRepository.findByUsuarioId(idUsuario);
	}
	
	 public Pedidos guardarPedido(Pedidos pedido) {
	        return pedidoRepository.save(pedido);
	    }
	
	public void guardarPedidos(List<Pedidos> pedidos) {
        pedidoRepository.saveAll(pedidos);
    }
		
	//-------------------------------
	@Override
	public Optional<Pedidos> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
	}

	@Override
	public <S extends Pedidos> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Pedidos> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedidos getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Pedidos> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pedidos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pedidos> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pedidos> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Pedidos> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Pedidos> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pedidos> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Pedidos> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Pedidos, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Pedidos> buscarPorClienteNombre1(String cliente_nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedidos> findByUsuarioId(Long usuarioId) {
		// TODO Auto-generated method stub
		return null;
	}




}
