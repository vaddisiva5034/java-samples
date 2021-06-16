class A {
    String firstName;

    void log() {
        System.out.println(this.firstName);
    }
}

class B extends A {

    String lastName;

    void log() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

class D {
    String lastName;

}

class C extends B {
    int age;

    void log1() {
        System.out.println(this.firstName + " " + this.lastName + " " + this.age);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        A obja = new A();

        obja.firstName = "kiran";

        obja.log();

        B obja2 = new B();
        obja2.firstName = "kiran";
        obja2.lastName = "vaddi";

        C obja3 = new C();
        obja3.firstName = "kiran";
        obja3.lastName = "vaddi";
        obja3.log1();

    }

}
