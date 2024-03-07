package com.mayur.demostudentmanagementsystem.Entities;

import com.mayur.demostudentmanagementsystem.Enums.Department;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teacherInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.TABLE)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@GeneratedValue(strategy = GenerationType.UUID)
    private int teacherId;

    private String name;

    @Column(unique = true)
    private String emailId;

    private int experience;

    @Enumerated(value = EnumType.STRING)
    private Department department;

    private int MobileNo;
}
