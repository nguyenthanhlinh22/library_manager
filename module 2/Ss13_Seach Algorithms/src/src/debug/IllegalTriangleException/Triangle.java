package src.debug.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cạnh thứ nhât ");
        int c1 = sc.nextInt();
        System.out.println("cạnh thứ hai");
        int c2 = sc.nextInt();
        System.out.println("cạnh đáy ");
        int c3 = sc.nextInt();
    }

    private void TriangleEdge(int a , int b , int c ) throws  Exception{
        try{
            if (a == 0 || b == 0  || c == 0 ){
                throw new Exception( "các cạnh khng được nhỏ hơn 0 ") ;
            }

        }catch(Exception e) {

        }

    }
}
