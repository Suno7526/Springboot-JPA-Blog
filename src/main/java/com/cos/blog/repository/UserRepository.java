package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean 등록
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer>{

	
	Optional<User> findByUsername(String username);
	
	/* User findByUsernameAndPassword(String username, String password); */

}
