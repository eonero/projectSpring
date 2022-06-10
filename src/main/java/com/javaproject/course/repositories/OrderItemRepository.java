package com.javaproject.course.repositories;

import com.javaproject.course.entities.OrderItem;
import com.javaproject.course.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
