package com.react.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.react.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
