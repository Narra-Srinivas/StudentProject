package com.students.service.impl;

import com.students.entity.students;
import com.students.repository.studentRepository;
import com.students.service.studentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements studentService {
    private studentRepository studentRepository;

    public StudentServiceImpl(com.students.repository.studentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public students saveStudent(students student) {
        return studentRepository.save(student);
    }

    @Override
    public students getStudentId(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public students updateStudent(students student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
