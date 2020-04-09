package com.campigoto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campigoto.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}