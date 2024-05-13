import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1 ; i <= n ; i++ ){
            if( n % i == 0 ){
                System.out.println(i);
            }

        }

    }


}
