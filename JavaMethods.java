import java.util.Scanner;

public class JavaMethods {

    // Method declartion
    // return void
    // paremeters int number1, int number2
    public static int add(int number1, int number2, String message) {
        number1 = 30;
        int result = number1 + number2;
        return result;
    }

    // 7
    public static int checkPrimeNumber(int number) {
        if (number == 2) {
            return 1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean isPrimeNumber(int result) {
        if (result == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetNum = scanner.nextInt();
        checkPrimeNumber(targetNum);
        // 5
        // boolean isTargePrime =
        if (isPrimeNumber(checkPrimeNumber(targetNum))) {
            System.out.println("given number is prime no factors");
        } else {
            for (int i = 2; i < targetNum; i++) {
                if (targetNum % i == 0) {
                    // boolean isPrimeNumber = checkPrimeNumber(i);
                    if (checkPrimeNumber(i) == 1) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        // int sum = add(i);
        // System.out.println(sum);

        // int a = 10, b = 20;

        // //catch
        // int c = add(a, b); // invookation

        // System.out.println(c); // 10

        // System.out.println(c);

        // 1000 line
    }

    // 18
    // 2 3 6 9
    // 2 3

    // length : 5
    // 4 6 8 9 10
    // sum

}
