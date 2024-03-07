package com.mayur.demostudentmanagementsystem.Service;

import com.mayur.demostudentmanagementsystem.Entities.Student;
import com.mayur.demostudentmanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(int studentId) throws Exception {
        Optional<Student> studentOptional = studentRepository.findById(studentId);
        if(studentOptional.isEmpty()) {
            throw new Exception("Enter valid studentId");
        }
        return studentOptional.get();
    }

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student added Successfully!";
    }

    public String updateStudent(Student student) throws Exception {
        Optional<Student> studentOptional = studentRepository.findById(student.getId());
        if(studentOptional.isEmpty()) {
            throw new Exception("Enter valid studentId");
        }
        studentRepository.save(student);
        return "Student information updated Successfully!";
    }

    public String deleteStudent(int studentId){
        studentRepository.deleteById(studentId);
        return "Student information deleted Successfully!";
    }


}
