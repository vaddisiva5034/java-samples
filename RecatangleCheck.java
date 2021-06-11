import java.util.Scanner;

class Rectangel {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }
}

public class RecatangleCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangel obj = new Rectangel();
        obj.length = 10;
        obj.breadth = 20;
        System.out.println(obj.area()); //
        Rectangel obj1 = new Rectangel();
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
        // ojj.average();
        // obj.total();
        // "in 10th class roll number is passed with toatal marks of 400";

        // MaraksSheet.className="9 "

    }
}
