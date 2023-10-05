package com.kamil.Awards.Service;

import com.kamil.Awards.Courses.CourseInterface;

public class ProcessCourseChoice {

    public CourseInterface programmingCourse;

    public void setProgrammingCourse(CourseInterface programmingCourse) {
        this.programmingCourse = programmingCourse;
    }

    public void takeDecision(){
        programmingCourse.buyCourse();
        System.out.println("You have just bought a bran new programming course!");
    }




}
