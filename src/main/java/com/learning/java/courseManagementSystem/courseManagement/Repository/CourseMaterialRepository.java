package com.learning.java.courseManagementSystem.courseManagement.Repository;

import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseMaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterialEntity,Long> {
    // Custom query to find course material by course ID
    CourseMaterialEntity findByCourse_Id(Long courseId);
}
