import Thanhlinh.User;
import codegym.Calculator;

public class App {
    public static void main(String[] args) {
        User.student student = new User.student( "thanh linh " , 10 );
        int result = Calculator.add(10,11 );
        System.out.println(student.getName() + student.getAge() + result);
    }
}
