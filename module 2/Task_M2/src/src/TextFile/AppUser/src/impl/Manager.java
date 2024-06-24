package src.TextFile.AppUser.src.impl;
import src.TextFile.AppUser.src.entity.User;

public interface Manager {
    void addUser(User user);
    void showList();
    void DeleteUser(int id);
    void UpdateUser(int id, User user);
    User getUser(int id);

}
