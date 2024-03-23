
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

import com.ecommerce_Blossom.ecomerce.model.Usuario;
import com.ecommerce_Blossom.ecomerce.repository.UsuarioRepository;

@Service
public class UsusarioService implements UsuarioRepository {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public List<Usuario> findAll(Sort sort) {
		return usuarioRepository.findAll(sort);
	}


	public Page<Usuario> findAll(Pageable pageable) {
		return usuarioRepository.findAll(pageable);
	}

	public <S extends Usuario> S save(S entity) {
		return usuarioRepository.save(entity);
	}
	
	public void guardarUsuarios(List<Usuario> Usuario) {
		usuarioRepository.saveAll(Usuario);
    }
	
	public void eliminarUsuarioPorId(Integer id) {
		usuarioRepository.deleteById(id);
	}
	 
	public Usuario buscarPorNombreDeUsuario(String email) {
		return usuarioRepository.findByemail(email);
	}

	
	public boolean autenticar(String username, String contraseña) {
        Usuario usuario = usuarioRepository.findByUsername(username);
        return usuario != null && usuario.getContraseña().equals(contraseña);
    }
	//--------------------------------------

	public void delete(Usuario entity) {
		usuarioRepository.delete(entity);
	}

	
	@Override
	public Usuario findByemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Usuario> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Usuario> entities) {
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
	public Usuario getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
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
		usuarioRepository.deleteById(id);
	}
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Usuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Usuario> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Usuario> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Usuario, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
