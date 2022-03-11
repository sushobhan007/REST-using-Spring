package com.springrest2.springrest.services;

import com.springrest2.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"Java for Beginners","The Basic Course on Java"));
        list.add(new Course(2,"Data Structure","Data Structure Course using Java"));
        list.add(new Course(3,"Machine Learning","A course on Machine Learning using Python"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;

    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
