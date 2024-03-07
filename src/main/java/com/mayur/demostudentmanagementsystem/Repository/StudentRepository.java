package com.mayur.demostudentmanagementsystem.Repository;

import com.mayur.demostudentmanagementsystem.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
