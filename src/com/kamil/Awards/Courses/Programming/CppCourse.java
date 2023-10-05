package com.kamil.Awards.Courses.Programming;

import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Courses;

public class CppCourse extends Courses implements CourseInterface {
    public CppCourse(int price) {
        super(price);
    }

    @Override
    public void buyCourse() {
        System.out.println("You have no idea what you have just done!! Good luck");
        priceInformation();

    }
}
