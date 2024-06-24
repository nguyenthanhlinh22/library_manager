package src.debug.Calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    //throws chi dinh
    public float divide(int a, int b) throws Exception {
        if( b == 0){
            //throw tung ra ngoai lê
            throw new Exception("Divide by zero");
        }
        return (float) a / b;
    }
}
