package com.javaproject.course.service;

import com.javaproject.course.entities.Usuario;
import com.javaproject.course.repositories.UsuarioRepository;
import com.javaproject.course.service.exceptions.DatabaseException;
import com.javaproject.course.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));

    }

    public Usuario insert (Usuario obj){
        return repository.save(obj);
    }


    public void delete(Long id){
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw  new DatabaseException(e.getMessage());
        }
    }

    public Usuario uptade(Long id, Usuario obj){
        try {
            Usuario entity = repository.getOne(id);
            updateData(entity, obj);
            return repository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
