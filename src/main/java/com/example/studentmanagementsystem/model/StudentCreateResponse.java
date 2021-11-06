package com.example.studentmanagementsystem.model;

import com.example.studentmanagementsystem.enums.Gender;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Divyanshu Singh on 06-11-2021
 */


@Data
public class StudentCreateResponse {

    private String studentId;

    private String firstName;

    private String lastname;

    private Gender gender;

    private StudentParentResponse parent;

    private LocalDateTime createdOn;
}
