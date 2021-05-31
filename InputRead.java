import java.util.*;

//this is gthe topic for input reading

//single line comments

/*
this is multile
comment
*/

class InputRead {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 13;
        boolean isMilkPackAvaible = true;
        String milkCompany = "vijaya";
        boolean isCurdAvaible = true;
        int num1 = 10, num2 = 20, num3 = 13;
        int K = (((a > b) ? a : b) > c) ? ((a > b) ? a : b) : c;
        // int res =

        if ((a > b)) {
            if ((a > c)) {
                System.out.println("a");
            } else {
                System.out.println("c");
            }
        } else {
            if (b > c) {
                System.out.println("b");
            } else {
                System.out.println("c");
            }
        }

        System.out.println(K);
        // System.out.println("entred into shop");
        // // System.out.println(conditionResult);
        // if (isMilkPackAvaible) {
        // System.out.println("brought milk");
        // if (milkCompany == "vijaya") {
        // System.out.println("brought only 1ltr vijaya milk");
        // } else if (milkCompany == "heritage") {
        // System.out.println("brought only 2ltr heritage milk");
        // }
        // } else if (isCurdAvaible) {
        // System.out.println("brought only curd");
        // } else {
        // System.out.println("nothing is avaible");
        // }
        // System.out.println("exit from shop");

        // 1 :lucky 2: rakesh 3: chanti 4: vamsi 5:kiran
        // rakesh
        // if (studnetRoll == 1) {
        // System.out.println("lucky");
        // } else if (studnetRoll == 1) {
        // System.out.println("lucky");
        // } else {
        // System.out.println("invalid");
        // }
        int studnetRoll = 10; // invalid rollno
        studnetRoll = 5;

        switch (studnetRoll) {
            case 1: // studnetRoll == 1
                System.out.println("lucky");
                break;
            case 2: // studnetRoll ==
                System.out.println("rakesh");
                break;
            case 3:
                System.out.println("chanti");
                break;
            case 4:
                System.out.println("vamsi");
                break;
            case 5:
                System.out.println("kiran");
                break;
            default:
                System.out.println("invalid");
        }
        System.out.println("next line");
        String name = "kiran";

        switch (name) {
            case "kiran": // studnetRoll == 1
                System.out.println("5");
                break;
            case "lucky": // studnetRoll ==
                System.out.println("4");
                break;
            case "":
                System.out.println("chanti");
                break;

            default:
                System.out.println("invalid");
        }

        // String petName = "";
        // DOG - bow , cat: mewow , cow : amba , donkey: donkey sound , defauilt : no
        // animal found
        String petName = "Dog";
        petName.toLowerCase();
        switch (petName) {
            case "dog":
                System.out.println("Bow Bow!");
                break;
            case "cat":
                System.out.println("Meow!");
                break;
            case "cow":
                System.out.println("Ambaa!");
                break;
            case "donkey":
                System.out.println("aahhhh!");
                break;
            default:
                System.out.println("not found");
        }

    }

}

// game:1 practice=10 rs;4

// menbs kit=100 rs;winner=1000 rs;runnre 500 rs;

// // student number 4 divisab;r => invalid student number
// 12;

// 120+300+1000+500=
// 1920

// // to read the inputs
// Scanner scanner = new Scanner(System.in);
// System.out.print("enter the first number : ");
// System.out.println("");
// // Reading the first number
// int number1 = scanner.nextInt();
// // float number = scanner.nextFloat();12
// // String name = scanner.nextLine();
// System.out.println("enter the second number : ");
// int number2 = 12;// scanner.nextInt();
// System.out.print("sum is :" + (number1 + number2));
// // "sum is : 3";