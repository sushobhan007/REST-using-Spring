package com.springrest2.springrest.services;

import com.springrest2.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(Long courseId);
    public Course addCourse(Course course);
}
