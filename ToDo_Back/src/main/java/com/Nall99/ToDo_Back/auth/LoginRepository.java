package com.Nall99.ToDo_Back.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LoginRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsername(String login);
	
}
