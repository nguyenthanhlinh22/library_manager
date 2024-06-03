package src;

public class student {
    private int id;
    private String name;
    private String age ;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public student(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age ;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "age" + age + '}';
    }
}
