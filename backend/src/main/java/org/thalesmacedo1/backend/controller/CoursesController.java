package org.thalesmacedo1.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thalesmacedo1.backend.model.Course;
import org.thalesmacedo1.backend.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/courses")
@AllArgsConstructor
public class CoursesController {

    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
