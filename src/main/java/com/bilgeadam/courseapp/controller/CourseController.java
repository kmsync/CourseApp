package com.bilgeadam.courseapp.controller;

import com.bilgeadam.courseapp.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        List<Course> courseList = new ArrayList();

        Course course1 = new Course("MAT101","Matematik Giriş","Cahit Arf");
        Course course2 = new Course("FIZ101","Fizik Giriş","Albert Einstein");
        Course course3 = new Course("BIY101","Biyoloji Giriş","Uğur Şahin");

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);

        return courseList;
    }

}