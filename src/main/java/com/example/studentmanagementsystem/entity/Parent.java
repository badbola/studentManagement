package com.example.studentmanagementsystem.entity;

import com.example.studentmanagementsystem.enums.Gender;
import com.example.studentmanagementsystem.enums.Relation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Divyanshu Singh on 02-10-2021
 */
@Data
@Entity
@Table(name = "parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parentId;

    private String firstName;

    private String lastName;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @JoinTable(name = "parent_student_realtion", joinColumns = @JoinColumn(name = "parent_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Student> students = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Relation relation;

    private String otherRelation;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobile;

    private String email;

    private boolean deleted;

    @CreationTimestamp
    private LocalDateTime createdOn;

    private String createdBy;

    @UpdateTimestamp
    private LocalDateTime modifiedOn;

    private String modifiedBy;

    public Parent setStudentId(Set<Student> setStudent) {
        this.students = setStudent;
        return this;
    }
}
