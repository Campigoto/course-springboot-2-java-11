package com.campigoto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campigoto.course.entities.OrderItem;
import com.campigoto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}