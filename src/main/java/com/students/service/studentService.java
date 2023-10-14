package com.students.service;

import com.students.entity.students;

import java.util.List;

public interface studentService {
    List<students> getAllStudents();
    students saveStudent(students student);
    students getStudentId(Long id);
    students updateStudent(students student);

    void deleteStudent(Long id);
}
