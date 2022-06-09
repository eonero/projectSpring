package com.javaproject.course.service;

import com.javaproject.course.entities.Usuario;
import com.javaproject.course.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }
    public Usuario findById (Long id){
        Optional<Usuario> obj = repository.findById(id);
        return obj.get();

    }



}
