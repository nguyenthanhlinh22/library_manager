public class student {
    private int rollno;
    private String name;
    private static String college = "BBDIT" ;

    student( int r , String n) {
        rollno = r ;
        name = n ;
    }
    static void change(){
        college = "Codegym" ;
    }

    void display(){
        System.out.println( rollno + " " + name + " " + college);
    }
}
