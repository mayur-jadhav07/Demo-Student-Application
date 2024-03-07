package com.mayur.demostudentmanagementsystem.Entities;

import com.mayur.demostudentmanagementsystem.Enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "studentInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

     @Id
     //@GeneratedValue(strategy = GenerationType.IDENTITY)
     //@GeneratedValue(strategy = GenerationType.AUTO)
     //@GeneratedValue(strategy = GenerationType.TABLE)
     //@GeneratedValue(strategy = GenerationType.SEQUENCE)
     //@GeneratedValue(strategy = GenerationType.UUID)
     //private String studentId;

//     @Id
//     @GeneratedValue(generator = "uuid2")
//     @GenericGenerator(name = "uuid2", strategy = "uuid2")
//     @Column(name = "teacher_id", columnDefinition = "BINARY(16)")
//     private UUID studentId;

     private int id;

     @Column(nullable = false)
     private String name;

     private int mobileNo;

     @Column(unique = true)
     private String emailId;

     @Enumerated(value = EnumType.STRING)
     private Department department;

     @Column(nullable = false)
     private Double cgpa;

     private String address;

     @JoinColumn
     @ManyToOne
     private Teacher teacher;

}
