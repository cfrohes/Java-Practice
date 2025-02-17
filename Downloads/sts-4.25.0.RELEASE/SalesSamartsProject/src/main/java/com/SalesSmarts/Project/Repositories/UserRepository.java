package com.SalesSmarts.Project.Repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesSmarts.Project.Entites.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	Optional<Users> findByUsername(String username);
	Optional<Users> findByEmail(String email);

}
