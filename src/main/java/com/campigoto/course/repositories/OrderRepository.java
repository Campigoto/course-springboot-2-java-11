package com.campigoto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campigoto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}