package com.learning.java.courseManagementSystem.courseManagement.Repository;

import com.learning.java.courseManagementSystem.courseManagement.Entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Long> {
}
