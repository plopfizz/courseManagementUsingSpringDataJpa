package com.learning.java.courseManagementSystem.courseManagement.Repository;

import com.learning.java.courseManagementSystem.courseManagement.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

}
