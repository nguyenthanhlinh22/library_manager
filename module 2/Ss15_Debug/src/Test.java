import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Number: ");
            int num = sc.nextInt();
            System.out.println("denominator: ");
            int denom = sc.nextInt();
            int result = num / denom;
            System.out.println("Result: " + result);
        }catch(ImagingOpException | ArithmeticException e ){
            System.out.println(e.getMessage());

        }
    }
}
