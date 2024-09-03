package com.learning.java.courseManagementSystem.courseManagement.Services;

import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseEntity;
import com.learning.java.courseManagementSystem.courseManagement.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private final CourseRepository courseRepository;

    CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<CourseEntity> getAllCourses(){
        return this.courseRepository.findAll();
    }
    public Optional<CourseEntity> getCourseById(Long id) {
        return courseRepository.findById(id);
    }
//    public List<CourseEntity> getCoursesByName(String courseName) {
//        return courseRepository.findByCourseNameContainingIgnoreCase(courseName);
//    }

//    public List<CourseEntity> getCoursesByGrade(String grade) {
//        return courseRepository.findByGrades(grade);
//    }
//    public List<CourseEntity> getCoursesByTeacherId(Long teacherId) {
//        return courseRepository.findByTeacher_Id(teacherId);
//    }

    public CourseEntity saveCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }




}
