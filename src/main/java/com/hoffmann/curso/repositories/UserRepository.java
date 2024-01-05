package com.hoffmann.curso.repositories;

import com.hoffmann.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
