package threadexample;

public class ThreadExample6 {
    public static void main(String[] args) {
        
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Set And Get Thread Name");
            }
        });
        
        thread6.start();

        System.out.println("thread6.getName() = " + thread6.getName());
        
        thread6.setName("Code States");

        System.out.println("thread6.getName() = " + thread6.getName());
    }

}
