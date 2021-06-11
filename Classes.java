import java.util.Scanner;

public class Classes {
    static int count = 0;
    int c;

    public static void test() {
        System.out.println("static");
    }

    public void check() {
        int b = 10;
        System.out.println(b);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        test();
        Classes obj = new Classes();
        obj.check();

        Classes.count++;

        // Classes obj1 = new Classes();
        count++;

        System.out.println(count); // 1
    }
}
