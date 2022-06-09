package com.javaproject.course.repositories;

import com.javaproject.course.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Usuario, Long> {
}
