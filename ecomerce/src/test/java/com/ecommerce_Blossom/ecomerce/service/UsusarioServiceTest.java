package com.ecommerce_Blossom.ecomerce.service;

import com.ecommerce_Blossom.ecomerce.model.Usuario;
import com.ecommerce_Blossom.ecomerce.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class UsusarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsusarioService UsusarioService;

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        usuario = new Usuario();
        usuario.setNombre("Pavilion");
        usuario.setApellido("trujillo");
        usuario.setCedula(1919234876);
        usuario.setId(32L);
        usuario.setEmail("pavipa@gmail.com");
        usuario.setFecha_registro(LocalDate.parse("2024-02-22"));
        usuario.setUsername("pavilionnnn");
        usuario.setContraseña("pavilion1234");
    }

    @Test
    void findAll() {
        Mockito.when(usuarioRepository.findAll()).thenReturn(Collections.singletonList(usuario));
        assertNotNull(UsusarioService.findAll());
    }


}