import src.student;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, student> students = new HashMap< String, student>();
        student s1 = new student(1, "THÀNH LONG ", "12");
        student s2 = new student(2,  "THÀNH LINH ",  "20");

        students.put("student1 ", s1);
        students.put("student2 ", s2);

        System.out.println(students.get("student1 "));
        System.out.println(students.get("student2 "));
        System.out.println(students.get(s1));
    }
}
