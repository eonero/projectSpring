package com.javaproject.course.repositories;

import com.javaproject.course.entities.Product;
import com.javaproject.course.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {
}
