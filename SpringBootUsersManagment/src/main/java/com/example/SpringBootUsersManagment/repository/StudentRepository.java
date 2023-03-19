package com.example.SpringBootUsersManagment.repository;

import com.example.SpringBootUsersManagment.entity.Student;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
