package com.school.demo.service;

import com.school.demo.exception.ResourceNotFoundException;
import com.school.demo.model.Student;
import com.school.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isEmpty()){
            throw new ResourceNotFoundException("Student does not exist");
        }
        return studentOptional.get();
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(long id, Student student){
        Student student1 = studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student does not exist with id" + id));
        return studentRepository.save(updateStudentDetails(student1,student));
    }

    private Student updateStudentDetails(Student s1, Student s2) {
        s1.setFirstName(s2.getFirstName());
        s1.setLastName(s2.getLastName());
        s1.setStd(s2.getStd());
        s1.setScore(s2.getScore());
        return s1;
    }
}
