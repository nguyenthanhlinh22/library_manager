package src.search_akg;

import java.util.ArrayList;
import java.util.List;

public class studentManager {
    private static List<student> students ;
    public studentManager() {
        students = new ArrayList<student>();
    }
    public List<student> getStudents() {
        return students;
    }
    public static void addStudent(student student) {
        students.add(student);

    }
    public void removeStudent(student student) {
        students.remove(student);

    }
    public List<student> searchstudentByName(String keyword) {
        List<student> data = new ArrayList<>();
        for (student student : students) {
            if(student.getName().equals(keyword)){
                data.add(student);
            }
        }
        return data ;
    }
     public List<student> searchstudentByID(int id) {
        List<student> data = new ArrayList<>();
        for (student student : students) {
            if(student.getId() == id){
                data.add(student);

            }
        }
        if (data.size() == 0) {
            System.out.println("not found");
        }
        return data;
     }
}
