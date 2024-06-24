package src.TextFile.AppUser.src.impl;

import src.TextFile.AppUser.src.UserManager;
import src.TextFile.AppUser.src.entity.User;

import java.util.Scanner;

public class Menu {
    private final UserManager userManager = new UserManager();
    public Menu(){

    }



    public void showMenu(){
        int choice = -1 ;
        do {
            System.out.println("-------------Welcome to userManager App--------");
            System.out.println("-------------Please enter number to use for app ---------------");
            System.out.println("1. show List of User");
            System.out.println("2. Add new User");
            System.out.println("3. Remove User");
            System.out.println("4. update User");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------");
            choice = getChoice();
            handleChoice(choice);
        }while (choice != 5 );



    }

    //phuong thuc nhap vao
    public int getChoice(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void handleChoice(int choice){


        switch(choice){
            case 1:
                MenuShowListUser();
                break;
            case 2:
                MenuAddNewUser();
                break;
            case 3:
                break;
            case 4:
                menuUpdateUser();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    private void MenuAddNewUser() {
        try{
            menuAddUser();
            System.out.println("Add User successfully!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void MenuShowListUser() {
        System.out.println("-------------List of User --------------");
        userManager.showList();
        System.out.println("=------------------------------------------");
    }

    public void menuAddUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Add User --------------");
        System.out.println("Enter ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter UserName");
        String userName = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter BirthDay: dd/mm/yyyy");
        String birthDay = sc.nextLine();
        User user = new User(id, userName, password, email, birthDay);
        userManager.addUser(user);
    }

    public void menuUpdateUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Add User --------------");
        System.out.println("Enter ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter UserName");
        String userName = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter BirthDay: dd/mm/yyyy");
        String birthDay = sc.nextLine();
        User user = new User(id, userName, password, email, birthDay);
        userManager.UpdateUser(id, user);

    }
}
