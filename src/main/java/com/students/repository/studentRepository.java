package com.students.repository;

import com.students.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<students, Long> {

}