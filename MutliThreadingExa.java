import java.util.Date;

class VerificationThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {

            // System.out.println(i + " verification done");
            // try {
            // Thread.sleep(1000);
            // } catch (Exception e) {
            // }

        }
    }
}

class WatchMovieThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        // System.out.println(10 / 0);
        for (int i = 0; i < 10; i++) {
            // System.out.println(i + " watching movie");
            // try {
            // Thread.sleep(1000);
            // } catch (Exception e) {
            // }
        }
    }
}

public class MutliThreadingExa {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Date obj = new Date();
        // System.out.println("statred at " + obj.getTime());

        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        // System.out.println("stoped at " + obj.getTime());
        Thread t1 = new VerificationThread();
        t1.setName("verification thread");
        Thread t2 = new WatchMovieThread();
        t2.setName("movie thread");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        t1.run();
        t1.run();
        t2.start();
    }
}
