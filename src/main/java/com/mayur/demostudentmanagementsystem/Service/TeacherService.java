package com.mayur.demostudentmanagementsystem.Service;

import com.mayur.demostudentmanagementsystem.Entities.Student;
import com.mayur.demostudentmanagementsystem.Entities.Teacher;
import com.mayur.demostudentmanagementsystem.Repository.StudentRepository;
import com.mayur.demostudentmanagementsystem.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher getTeacher(int teacherId) throws Exception {
        Optional<Teacher> teacherOptional = teacherRepository.findById(teacherId);
        if(teacherOptional.isEmpty()) {
            throw new Exception("Enter valid teacherId");
        }
        return teacherOptional.get();
    }

    public String addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
        return "Teacher added Successfully!";
    }

    public String updateTeacher(Teacher teacher) throws Exception {
        Optional<Teacher> teacherOptional = teacherRepository.findById(teacher.getTeacherId());
        if(teacherOptional.isEmpty()) {
            throw new Exception("Enter valid TeacherId");
        }
        teacherRepository.save(teacher);
        return "Teacher information updated Successfully!";
    }

    public String deleteTeacher(int teacherId){
        teacherRepository.deleteById(teacherId);
        return "Teacher information deleted Successfully!";
    }
}
