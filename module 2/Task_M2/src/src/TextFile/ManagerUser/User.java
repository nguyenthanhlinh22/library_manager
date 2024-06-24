package src.TextFile.ManagerUser;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String userName;
    public User(String id, String userName) {
        this.id = Integer.parseInt(id);
        this.userName = userName ;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


}
