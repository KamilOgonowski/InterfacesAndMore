import com.kamil.Awards.Courses.Programming.JavaCourse;
import com.kamil.Awards.Service.ProcessCourseChoice;

public class Main {
    public static void main(String[] args) {
        ProcessCourseChoice boughtCourse = new ProcessCourseChoice();
        boughtCourse.setProgrammingCourse(new JavaCourse(200));
        boughtCourse.takeDecision();

    }
}