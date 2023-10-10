import com.kamil.Awards.Courses.Programming.JavaCourse;
import com.kamil.Awards.Service.ProcessCourseChoice;
import com.kamil.Awards.User.User;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ProcessCourseChoice boughtCourse = new ProcessCourseChoice();
        boughtCourse.setProgrammingCourse(new JavaCourse(137.50));

        User testUser = new User();
        boughtCourse.setUser(testUser);

        boughtCourse.takeDecision();
    }
}