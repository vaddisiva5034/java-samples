package p1;

public class AccessModifiers {
    private int a = 10;

    void log() {
        System.out.println("message is loged");
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.log();
        System.out.println(obj.a);
    }

}

class Test2 {
    public static void main() {
        AccessModifiers obj = new AccessModifiers();
        obj.log();
        System.out.println(obj.a);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.log();
        System.out.println(obj.a);
    }
}