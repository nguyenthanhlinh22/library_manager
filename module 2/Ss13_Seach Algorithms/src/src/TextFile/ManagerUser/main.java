package src.TextFile.ManagerUser;
import java.util.Scanner;
import static src.TextFile.ManagerUser.Funciton.addUser;
import static src.TextFile.ManagerUser.Funciton.display;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( true){
            System.out.println("Choose");
            System.out.println("Function 1 : display user ");
            System.out.println("Function 2 : Add user");
            System.out.println("Out");
            System.out.println("---------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addUser(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
