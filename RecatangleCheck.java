import java.util.Scanner;

class Rectangel {
    int length; // 0
    int breadth; // 0

    public Rectangel() {
        System.out.println("default constuctor");
    }

    public Rectangel(int length, int breadth, int height) {
        System.out.println("insdei parms " + this.length);
        this.length = length;
        System.out.println("insdei parms 2 - " + this.length);
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int area(int breadth) {
        return length * breadth;
    }

}

public class RecatangleCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // a();
        Rectangel obj = new Rectangel(10, 20, 30);
        System.out.println("parms - " + obj.length);
        obj.length = 10;
        obj.breadth = 20;
        // obj = new Rectangel();
        // // obj.length //

        System.out.println(obj.area()); //
        Rectangel obj1 = new Rectangel();//
        System.out.println("default constructor : " + obj1.length);
        obj1.length = 100;
        obj1.breadth = 30;
        System.out.println(obj1.area()); //

        // MaraksSheet;

        // className ="10th class"
        // roll no
        // telugu= 90
        // english
        // hindi
        // maths

        // obj
        // ojj.average(); //
        // obj.total();
        // "in 10th class roll number is passed with toatal marks of 400";

        // MaraksSheet.className="9 "

    }
}
