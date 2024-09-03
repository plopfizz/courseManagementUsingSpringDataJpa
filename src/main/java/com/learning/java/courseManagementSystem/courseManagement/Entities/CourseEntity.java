package com.learning.java.courseManagementSystem.courseManagement.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@Component
@Builder
@Entity
public class CourseEntity {
    @Id
    @SequenceGenerator(name = "course_seq", sequenceName = "course_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @Column(name = "course_id")
    private long id;
    @Column(name = "course_name")
    private String CourseName;
    private String grades;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacher;

    @ManyToMany
    @JoinTable(
            name = "course_students",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")


    )
    private List<StudentEntity> students;

    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private CourseMaterialEntity courseMaterial;


    public CourseEntity(long id, String courseName, String grades, TeacherEntity teacher, List<StudentEntity> students, CourseMaterialEntity courseMaterial) {
        this.id = id;
        CourseName = courseName;
        this.grades = grades;
        this.teacher = teacher;
        this.students = students;
        this.courseMaterial = courseMaterial;
    }
}
