package com.kamil.Awards.Courses.Programming;

import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Courses;

public class PythonCourse extends Courses implements CourseInterface {
    public PythonCourse(int price) {
        super(price);
    }

    @Override
    public void buyCourse() {
        System.out.println("New wave, follow the snake!");
        priceInformation();

    }
}
