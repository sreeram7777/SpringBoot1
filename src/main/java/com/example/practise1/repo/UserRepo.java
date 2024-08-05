package com.example.practise1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practise1.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
