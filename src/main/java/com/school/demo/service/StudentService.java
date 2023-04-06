package com.school.demo.service;

import com.school.demo.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();
    public Student getStudentById(long id);
    public Student saveStudent(Student student);
    public Student updateStudent(long id, Student student);


}
