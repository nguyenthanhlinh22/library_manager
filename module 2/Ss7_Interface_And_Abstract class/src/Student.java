package src;

public class Student extends Person{
    private String group ;

     protected Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }
   @Override
   public String getInfo() {
       return "Name: " + name + ", Age: " + age + "\n";
   }
}
