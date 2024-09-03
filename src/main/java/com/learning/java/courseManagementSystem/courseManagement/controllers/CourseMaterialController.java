package com.learning.java.courseManagementSystem.courseManagement.controllers;

import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseEntity;
import com.learning.java.courseManagementSystem.courseManagement.Entities.CourseMaterialEntity;
import com.learning.java.courseManagementSystem.courseManagement.Services.CourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/course-materials")
public class CourseMaterialController {

    private final CourseMaterialService courseMaterialService;

    @Autowired
    public CourseMaterialController(CourseMaterialService courseMaterialService) {
        this.courseMaterialService = courseMaterialService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseMaterialEntity> getCourseMaterialById(@PathVariable Long id) {
        Optional<CourseMaterialEntity> courseMaterial = courseMaterialService.getCourseMaterialById(id);
        return courseMaterial.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<CourseMaterialEntity> getCourseMaterialByCourseId(@PathVariable Long courseId) {
        Optional<CourseMaterialEntity> courseMaterial = courseMaterialService.getCourseMaterialByCourseId(courseId);
        return courseMaterial.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CourseMaterialEntity> createCourseMaterial() {
        CourseMaterialEntity material = CourseMaterialEntity.builder()
                .id(1L)
                .CourseDetails("Java Programming Guide")
                .bookCount(5)
                .course(
                        new CourseEntity (2,
                 "A",
                 null,
                 null,
                null,
                null)
)

                .build();

        CourseMaterialEntity savedCourseMaterial = courseMaterialService.saveCourseMaterial(material);
        return ResponseEntity.ok(savedCourseMaterial);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourseMaterial(@PathVariable Long id) {
        courseMaterialService.deleteCourseMaterial(id);
        return ResponseEntity.noContent().build();
    }
}

