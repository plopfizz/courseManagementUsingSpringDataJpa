package com.learning.java.courseManagementSystem.courseManagement.Repository;

import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {

}
