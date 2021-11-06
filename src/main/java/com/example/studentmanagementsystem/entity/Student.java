package com.example.studentmanagementsystem.entity;

import com.example.studentmanagementsystem.enums.Gender;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Divyanshu Singh on 02-10-2021
 */

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentId;

    private String firstname;

    private String lastname;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @ManyToMany(mappedBy = "students", targetEntity = Parent.class, cascade = CascadeType.MERGE, fetch =
            FetchType.LAZY)
    private Set<Parent> parents = new LinkedHashSet<>();

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean deleted;

    @CreationTimestamp
    private LocalDateTime createdOn;

    private String createdBy;

    @UpdateTimestamp
    private LocalDateTime modifiedOn;

    private String modifiedBy;

    public Student setParentId(Set<Parent> setParent) {
        this.parents = setParent;
        return this;
    }
}
