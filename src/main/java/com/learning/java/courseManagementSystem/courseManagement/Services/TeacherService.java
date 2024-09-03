package com.learning.java.courseManagementSystem.courseManagement.Services;

import com.learning.java.courseManagementSystem.courseManagement.Entities.TeacherEntity;
import com.learning.java.courseManagementSystem.courseManagement.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherEntity> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<TeacherEntity> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

//    public List<TeacherEntity> getTeachersByName(String name) {
//        return teacherRepository.findByNameContainingIgnoreCase(name);
//    }
//
//    public List<TeacherEntity> getTeachersByCourseId(Long courseId) {
//        return teacherRepository.findByCourses_Id(courseId);
//    }

    public TeacherEntity saveTeacher(TeacherEntity teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
