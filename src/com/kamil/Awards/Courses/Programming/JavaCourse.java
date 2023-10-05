package com.kamil.Awards.Courses.Programming;

import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Courses;

public class JavaCourse extends Courses implements CourseInterface {
    public JavaCourse(int price) {
        super(price);
    }

    @Override
    public void buyCourse() {
        System.out.println("Good choice you have decided to buy Java Course!");
        priceInformation();

    }
}
