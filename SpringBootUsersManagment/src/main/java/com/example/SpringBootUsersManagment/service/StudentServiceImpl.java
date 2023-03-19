package com.example.SpringBootUsersManagment.service;

import com.example.SpringBootUsersManagment.entity.Student;
import com.example.SpringBootUsersManagment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findUserByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
