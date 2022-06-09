package com.javaproject.course.repositories;

import com.javaproject.course.entities.Order;
import com.javaproject.course.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
}
