package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Divyanshu Singh on 02-10-2021
 */
@Service
@Data
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
