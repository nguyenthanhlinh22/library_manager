package src.debug.NumberFormatException;

import java.util.Scanner;

public class calcuationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập x ");
        int x = sc.nextInt();
        System.out.println("Hãy nhập y ");
        int y = sc.nextInt();
//        calcuationExample calc = new calcuationExample();
        calculation(x,y);

    }

    private static void calculation(int x , int y) {
        try {
            int a = x + y ;
            int b = x - y ;
            int c = x * y ;
            int  d = x / y ;
            System.out.println("Tổng x + y " + a );
            System.out.println("Hiệu x - y " + b );
            System.out.println("Tích x * y " + c );
            System.out.println("Thương x / y " + d );
        }catch (Exception e) {
            System.out.println("xảy ra ngoại lệ " + e.getMessage());
        }

    }
}
