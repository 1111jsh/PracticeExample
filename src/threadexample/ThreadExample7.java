package threadexample;

public class ThreadExample7 {
    public static void main(String[] args) {

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread7.start();
        System.out.println(Thread.currentThread().getName());
    }
}
