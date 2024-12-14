package com.belvinard.todo_management.repository;

import com.belvinard.todo_management.entity.User;
import com.belvinard.todo_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries (optional)
}