class A1 {
    String name;

    A1(String name) {
        this.name = name;
        System.out.println("hello from A constructor");
    }

    void log() {
        System.out.println("hello from A");
    }
}

class B1 extends A1 {
    String lastName;

    B1(String lname, String name) {
        super(lname);
        this.lastName = lname;
    }

    void log() {
        super.log();
        System.out.println("hello from B");
    }
}

class C1 extends B1 {
    String city;

    public C1(String name, String lname, String city) {
        super(lname, name);
        this.city = city;
        System.out.println("hello from C constructor");
    }

    void log() {
        super.log();
        System.out.println("hello from C");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        C1 obj = new C1("kiran", "vaddi", "cc");
        obj.log();
    }
}
