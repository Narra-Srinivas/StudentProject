package com.students.controller;

import com.students.entity.students;
import com.students.service.studentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    public StudentController(com.students.service.studentService studentService) {
        super();
        this.studentService = studentService;
    }

    private studentService studentService;
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/students")
    public String listStudents(Model model){
            model.addAttribute("students", studentService.getAllStudents());
            return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        students student = new students();
        model.addAttribute("newStudent", student);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") students student){
        studentService.saveStudent(student);
        return "redirect:/students";

    }
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentId(id));
        return "edit_student";

    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student")students student, Model model){
        students existingStudent = studentService.getStudentId(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
    @GetMapping(value = "/**")
    public String defaultPage(){
        return "redirect:/not_found";
    }

    @GetMapping("/not_found")
    public String notFound(){
        return "not_found";
    }
}
