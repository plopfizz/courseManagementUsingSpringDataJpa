package com.learning.java.courseManagementSystem.courseManagement.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterialEntity {
    @Id
    @SequenceGenerator(name="course_material_seq",sequenceName = "course_material_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_material_seq")
    @Column(name = "course_material_id")
    private long id;
    private String CourseDetails;
    private int bookCount;
    @OneToOne
   @JoinColumn(name = "course_id",referencedColumnName = "course_id")
    private CourseEntity course;
}
