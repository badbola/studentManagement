package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Divyanshu Singh on 02-10-2021
 */
public interface StudentRepository extends JpaRepository<Student,Long> {

}
