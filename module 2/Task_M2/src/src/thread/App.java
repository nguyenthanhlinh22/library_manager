package src.thread;

public class App {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            int total = 0;
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 == 0) {
                        total += i;
                    }
                }
                System.out.println("tong so chan " + total);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            int total1 = 0;
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 != 0) {
                        total1 += i;
                    }
                }
                System.out.println("tong so le" + total1);

            }
        });
        thread2.start();
    }
}
