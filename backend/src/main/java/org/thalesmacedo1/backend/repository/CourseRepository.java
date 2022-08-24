package org.thalesmacedo1.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thalesmacedo1.backend.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
