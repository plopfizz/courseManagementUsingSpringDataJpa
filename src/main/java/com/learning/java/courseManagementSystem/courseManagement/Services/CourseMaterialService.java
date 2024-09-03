package com.learning.java.courseManagementSystem.courseManagement.Services;

import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseMaterialEntity;
import com.learning.java.courseManagementSystem.courseManagement.Repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CourseMaterialService {

    private final CourseMaterialRepository courseMaterialRepository;

    @Autowired
    public CourseMaterialService(CourseMaterialRepository courseMaterialRepository) {
        this.courseMaterialRepository = courseMaterialRepository;
    }

    public Optional<CourseMaterialEntity> getCourseMaterialById(Long id) {
        return courseMaterialRepository.findById(id);
    }

    public Optional<CourseMaterialEntity> getCourseMaterialByCourseId(Long courseId) {
        return Optional.ofNullable(courseMaterialRepository.findByCourse_Id(courseId));
    }

    public CourseMaterialEntity saveCourseMaterial(CourseMaterialEntity courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    public void deleteCourseMaterial(Long id) {
        courseMaterialRepository.deleteById(id);
    }
}
