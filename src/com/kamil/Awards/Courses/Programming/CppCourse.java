package com.kamil.Awards.Courses.Programming;
import com.kamil.Awards.Courses.CourseInterface;
import com.kamil.Awards.Courses.Courses;

public class CppCourse extends Courses implements CourseInterface {

    public final String type = "C++";

    public CppCourse(double price) {
        super(price);
    }
    @Override
    public void buyCourse() {
        System.out.println("You have no idea what you have just done!! Good luck and remember - there is no garbage collector..");
        priceInformation();

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
