package src.TextFile.ManagerUser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funciton {
    private static List<User>
    loadUsers() {
        File myFileUser = new File("./ManagerUser/DataUser.txt");
        List<User> users = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFileUser))) {
            users = (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading file");
        }
        return users;
    }

    private static void saveUsers(List<User> users) {
        File myFileUser = new File("./ManagerUser/DataUser.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myFileUser))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void display(){
        List<User> users = loadUsers();
        if (users.isEmpty()){
            System.out.println("Nothing to show");
            System.out.println("----------------");
        }else {
            System.out.println("list have user");
            for (User user : users){
                System.out.println("id :"  + user.getId() + "\n" + "Name User : " + user.getUserName() );
            }
        }
    }
    static void addUser(Scanner scanner) {
        List<User> users = loadUsers();
        System.out.print("Nhập ID của người dùng: ");
        String id = scanner.nextLine();
        System.out.print("Nhập username của người dùng: ");
        String username = scanner.nextLine();

        User newUser = new User(id, username);
        users.add(newUser);
        saveUsers(users);
        System.out.println("Người dùng đã được thêm vào danh sách.");
    }
}
