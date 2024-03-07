package com.mayur.demostudentmanagementsystem.Controller;

import com.mayur.demostudentmanagementsystem.Entities.Student;
import com.mayur.demostudentmanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/Info/{studentID}")
    public ResponseEntity viewStudent(@PathVariable("studentID") int studentId){
        try {
            Student student = studentService.getStudent(studentId);
            return new ResponseEntity(student, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        try {
            String result = studentService.addStudent(student);
            return new ResponseEntity(result, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{studentId}")
    public ResponseEntity updateStudent(@RequestBody Student student){
        try {
            String result = studentService.updateStudent(student);
            return new ResponseEntity(result, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity deleteStudent(int studentId){
        try {
            String result = studentService.deleteStudent(studentId);
            return new ResponseEntity(result, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}