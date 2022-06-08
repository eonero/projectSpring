package com.javaproject.course.UserResources;

import com.javaproject.course.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
         Usuario u = new Usuario(1l, "Maria","maria@gmail.com","6666", "12345");
        return ResponseEntity.ok(u);
    }


}
