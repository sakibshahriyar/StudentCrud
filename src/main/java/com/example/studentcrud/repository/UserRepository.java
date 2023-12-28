package com.example.studentcrud.repository;
import com.example.studentcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    // Additional custom queries can be added here if needed
}
