package com.learning.java.courseManagementSystem.courseManagement.Services;

import com.learning.java.courseManagementSystem.courseManagement.Entities.StudentEntity;
import com.learning.java.courseManagementSystem.courseManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<StudentEntity> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

//    public List<StudentEntity> getStudentsByName(String name) {
//        return studentRepository.findByNameContainingIgnoreCase(name);
//    }

//    public List<StudentEntity> getStudentsByEmail(String email) {
//        return studentRepository.findByEmail(email);
//    }
//
//    public List<StudentEntity> getStudentsByDepartment(String department) {
//        return studentRepository.findByDepartment(department);
//    }
//
//    public List<StudentEntity> getStudentsByCourseId(Long courseId) {
//        return studentRepository.findByCourse_Id(courseId);
//    }

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

