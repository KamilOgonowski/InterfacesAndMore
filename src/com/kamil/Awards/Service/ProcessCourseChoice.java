package com.kamil.Awards.Service;

import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Programming.CppCourse;
import com.kamil.Awards.Courses.Programming.JavaCourse;
import com.kamil.Awards.Courses.Programming.PythonCourse;
import com.kamil.Awards.User.User;

public class ProcessCourseChoice {

    public CourseInterface programmingCourse;
    public User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setProgrammingCourse(CourseInterface programmingCourse) {
        this.programmingCourse = programmingCourse;
    }

    public void takeDecision() {

        if (programmingCourse instanceof JavaCourse) {
            if (user.wallet >= ((JavaCourse) programmingCourse).price) {
                user.wallet -= ((JavaCourse) programmingCourse).price;
                programmingCourse.buyCourse();
                System.out.println("You have just bought a brand new programming course! You have now $" + user.wallet + ".");
            } else {
                System.out.println("You do not have enough money to buy the course! The Java course costs $" + ((JavaCourse) programmingCourse).price + " ,while you have only $" + user.wallet + ".");
            }
        } else if (programmingCourse instanceof CppCourse) {
            if (user.wallet >= ((CppCourse) programmingCourse).price) {
                user.wallet -= ((CppCourse) programmingCourse).price;
                programmingCourse.buyCourse();
                System.out.println("You have just bought a brand new programming course!. You have now $" +user.wallet + ".");
            } else {
                System.out.println("You do not have enough money to buy the course! The C++ course costs $" + ((CppCourse) programmingCourse).price + " ,while you have only $" + user.wallet + ".");
            }
        } else if (programmingCourse instanceof PythonCourse) {
            if (user.wallet >= ((PythonCourse) programmingCourse).price) {
                user.wallet -= ((PythonCourse) programmingCourse).price;
                programmingCourse.buyCourse();
                System.out.println("You have just bought a brand new programming course!. You have now $" +user.wallet + ".");
            } else {
                System.out.println("You do not have enough money to buy the course! The C++ course costs $" + ((PythonCourse) programmingCourse).price + " ,while you have only $" + user.wallet + ".");
            }
        }
    }
}
