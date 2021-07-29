class MyFirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }
}

class MySecondThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }
}

public class MultiThredingExample {
    public static void main(String[] args) {
        Thread t1 = new MyFirstThread();
        Thread t2 = new MySecondThread();
        t1.start();
        t2.start();

    }
}
