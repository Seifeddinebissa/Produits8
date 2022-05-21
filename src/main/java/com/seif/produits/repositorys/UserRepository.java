package com.seif.produits.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seif.produits.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername (String username);
}
