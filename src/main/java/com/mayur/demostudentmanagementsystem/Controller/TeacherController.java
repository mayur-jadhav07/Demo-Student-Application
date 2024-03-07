package com.mayur.demostudentmanagementsystem.Controller;


import com.mayur.demostudentmanagementsystem.Entities.Teacher;
import com.mayur.demostudentmanagementsystem.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/info/{teacherId}")
    public ResponseEntity<Teacher> viewTeacher(@PathVariable int teacherId) {
        try {
            Teacher teacher = teacherService.getTeacher(teacherId);
            return new ResponseEntity<>(teacher, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher) {
        try {
            String result = teacherService.addTeacher(teacher);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{teacherId}")
    public ResponseEntity<String> updateTeacher(@PathVariable int teacherId, @RequestBody Teacher teacher) {
        try {
            teacher.setTeacherId(teacherId); // Set the teacherId from path variable
            String result = teacherService.updateTeacher(teacher);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{teacherId}")
    public ResponseEntity<String> deleteTeacher(@PathVariable int teacherId) {
        try {
            String result = teacherService.deleteTeacher(teacherId);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

