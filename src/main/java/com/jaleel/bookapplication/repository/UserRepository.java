package com.jaleel.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaleel.bookapplication.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByEmailAndPassword (String emailid,String Password) ;

}