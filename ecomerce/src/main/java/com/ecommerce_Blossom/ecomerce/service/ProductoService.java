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

import com.ecommerce_Blossom.ecomerce.model.Productos;
import com.ecommerce_Blossom.ecomerce.repository.ProductosRepository;

@Service
public class ProductoService implements ProductosRepository {

	@Autowired
	private ProductosRepository productosRepository;


	@Override
	public List<Productos> findAll() {
		return productosRepository.findAll();
	}

	@Override
	public List<Productos> findAll(Sort sort) {
		return productosRepository.findAll(sort);
	}


	@Override
	public Page<Productos> findAll(Pageable pageable) {
		return productosRepository.findAll(pageable);
	}

	@Override
	public <S extends Productos> S save(S entity) {
		return productosRepository.save(entity);
	}
	
	public void eliminarProductosPorId(Integer id) {
		productosRepository.deleteById(id);
	}
	
	public Optional<Productos> buscarPorId(Integer id) {
       return productosRepository.findById(id);
   }
	
	public List<Productos> buscarPorNombre(String nombre) {
		return productosRepository.findByNombre(nombre);
	}
	
	public List<Productos> buscarPorRangoDePrecio(Double precioMin, Double precioMax) {
        return productosRepository.findByPrecioBetween(precioMin, precioMax);
    }
	
	public List<Productos> buscarPorCategoria(String categoria) {
        return productosRepository.findByCategoria(categoria);
    }
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Productos> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Productos> entities) {
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
	public Productos getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> findAllById(Iterable<Integer> ids) {
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
		productosRepository.deleteById(id);
	}

	@Override
	public void delete(Productos entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Productos> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public <S extends Productos> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Productos> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Productos> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Productos> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Productos, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Productos> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Productos> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> findByPrecioBetween(Double precioMin, Double precioMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> findByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}



		
	
}
