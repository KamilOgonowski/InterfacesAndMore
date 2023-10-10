package com.kamil.Awards.Service;

import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Programming.CppCourse;
import com.kamil.Awards.Courses.Programming.JavaCourse;
import com.kamil.Awards.Courses.Programming.PythonCourse;
import com.kamil.Awards.User.User;

public class ProcessCourseChoice {

    public CourseInterface programmingCourse;
    public User user;

    public void setProgrammingCourse(CourseInterface programmingCourse) {
        this.programmingCourse = programmingCourse;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void takeDecision() {
        if (user.wallet >= programmingCourse.getPrice()){
            user.wallet -= programmingCourse.getPrice();
            System.out.println("You have just bought a brand new " +programmingCourse.getType() + " course! The saldo on your account is equal to: $" + user.wallet);
            programmingCourse.buyCourse();
        } else{
            System.out.println("You do not have enough money to make a payment! The " + programmingCourse.getType() + " course costs $" + programmingCourse.getPrice() +", while you have only "+ user.wallet);
        }
    }
}
