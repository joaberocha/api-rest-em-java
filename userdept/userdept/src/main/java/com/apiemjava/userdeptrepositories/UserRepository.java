package com.apiemjava.userdeptrepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiemjava.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
