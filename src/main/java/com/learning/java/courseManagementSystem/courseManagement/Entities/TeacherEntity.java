package com.learning.java.courseManagementSystem.courseManagement.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {
    @Id
    @SequenceGenerator(name="teacher_seq",sequenceName = "teacher_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teacher_seq")
    @Column(name = "teacher_id")
    private long id;
    private String name;
    @OneToMany(mappedBy ="teacher" )
    private List<CourseEntity> Courses;
}
