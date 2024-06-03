package src;

public class User extends Person{
    User(String name, int age) {
        super(name, age);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + ", Age: " + age + "\n";
    }
}
