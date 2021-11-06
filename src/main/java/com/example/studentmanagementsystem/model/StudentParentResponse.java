package com.example.studentmanagementsystem.model;

import com.example.studentmanagementsystem.enums.Gender;
import com.example.studentmanagementsystem.enums.Relation;
import lombok.Data;

/**
 * @author Divyanshu Singh on 06-11-2021
 */

@Data
public class StudentParentResponse {

    private String parentId;

    private String firstName;

    private String lastName;

    private Relation relation;

    private String otherRelation;

    private Gender gender;

    private String mobile;

    private String email;
}
