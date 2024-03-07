package com.mayur.demostudentmanagementsystem.Repository;

import com.mayur.demostudentmanagementsystem.Entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
