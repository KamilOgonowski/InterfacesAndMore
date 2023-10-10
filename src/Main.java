import com.kamil.Awards.Courses.Programming.CppCourse;
import com.kamil.Awards.Courses.Programming.JavaCourse;
import com.kamil.Awards.Courses.Programming.PythonCourse;
import com.kamil.Awards.Service.ProcessCourseChoice;
import com.kamil.Awards.User.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n======Checking setter injection======\n");
        ProcessCourseChoice boughtCourse = new ProcessCourseChoice();
        boughtCourse.setProgrammingCourse(new PythonCourse(137.50));

        User testUser = new User();
        boughtCourse.setUser(testUser);

        boughtCourse.takeDecision();

        System.out.println("\n======Checking constructor injection======\n");

        ProcessCourseChoice boughtCourse2 = new ProcessCourseChoice(new User());
        boughtCourse2.setProgrammingCourse(new JavaCourse(120));
        boughtCourse2.takeDecision();
    }
}