package com.example.student.service.impl;

import com.example.student.model.Student;

import java.util.List;

public interface StudentService {
    Student save();
    Student findById(long id);
    List<Student> findAll();

}
