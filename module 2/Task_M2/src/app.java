import src.search_akg.student;
import src.search_akg.studentManager;

import java.util.List;

public class app {
    public static void main(String[] args) {
       studentManager studentManager = new studentManager();
        src.search_akg.studentManager.addStudent(new student(1, "linh", 20 , "Male"));
        src.search_akg.studentManager.addStudent(new student(2, "giang", 20 , "Male"));
        src.search_akg.studentManager.addStudent(new student(3, "canh", 20 , "Male"));
        src.search_akg.studentManager.addStudent(new student(4, "thư", 20 , "Male"));

    List<student> students = studentManager.searchstudentByName("thư");

    for(student student : students) {
        System.out.println(student);

    }

    System.out.println(studentManager.searchstudentByID(5));


    }
}
