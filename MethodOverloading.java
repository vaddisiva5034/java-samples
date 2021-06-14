public class MethodOverloading {

    public static int add() {
        System.out.println("no parmatere");
        return 0;
    }

    public static int add(int a) {
        System.out.println("1 parmatere int ");
        return a;
    }

    public static int add(String a) {
        System.out.println("1 parmatere string ");
        return Integer.parseInt(a);
    }

    public static int add(int a, int b) {
        System.out.println("2 parmatere");
        return a + b;
    }

    public static long add(int a, int b, int c, int d) {
        System.out.println("2 parmatere");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("3 parmatere");
        return a + b + c;
    }

    public static int add(int a, String b, int c) {
        System.out.println("3 parmatere");
        return 0;
    }

    public static int add(int a, String b, String c) {
        System.out.println("3 parmatere");
        return 0;
    }

    public static void main(String[] args) {
        add(2, 3, 4); // add()
    }
}
