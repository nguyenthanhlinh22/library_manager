package src.debug.Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(10 , 2 ));
//       try{
//           System.out.println(calculator.divide(10,0));
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }
//
//        System.out.println(Calculator.subtract(10,5));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a :");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("enter b : ");
        int b = Integer.parseInt(scanner.nextLine());
        try{

            System.out.println( calculator.divide(a, b ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("done");
        }

    }
}
