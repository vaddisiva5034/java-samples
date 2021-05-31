import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {

        // int a = 10;
        // int b = 20;
        // // Write your logic
        // a = a + b; // 30
        // b = a - b; /// 10
        // a = a - b; // 20
        // System.out.println(a + " " + b);
        // // 20 10

        // a=b
        // b = a
        Scanner scanner = new Scanner(System.in);
        // reading length
        int length = scanner.nextInt();
        // array creating
        int[] numbers = new int[length];

        // reading numbers
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // read find number
        int findNumber = scanner.nextInt();

        // // creating foundindex
        // int highestNumber = numbers[0];
        boolean found = false;

        // // loooking thorugh all the inputs
        // for (int i = 0; i < length - 1; i++) {
        // // checking is the number maths with find number
        // if (numbers[i] + numbers[i + 1] == findNumber) {
        // // updating found index with matched index
        // found = true;
        // break;

        // // breaking the loop
        // // break;
        // }
        // }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // checking is the number maths with find number
                if (numbers[i] + numbers[j] == findNumber) {
                    // updating found index with matched index
                    found = true;
                    break;
                }
                // breaking the loop
                // break;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        // -4 -3 -2 -1 0 1 2 3 4

        // 5
        // 1 5 3 8 9
        // 3

        // 4
        // -4 -3 -1 -2
    }
}
