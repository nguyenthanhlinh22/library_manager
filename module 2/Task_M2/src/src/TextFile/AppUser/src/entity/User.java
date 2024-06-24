package src.TextFile.AppUser.src.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String birthDay;

    public User(int id, String name, String password, String email, String birthDay) {
     this.id = id;
     this.name = name;
     this.password = password;
     this.email = email;
     this.birthDay = birthDay;
    }
    public User(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
