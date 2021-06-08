public class FactorialRecerssion {

    public static int factorialOfNumber(int number) {
        if (number == 1)
            return 1;
        return number * factorialOfNumber(number - 1);
        // * -2
    }

    public static void main(String[] args) {
        int factorialOfNum = factorialOfNumber(3);
        System.out.println(factorialOfNum);

    }
}

// 1 X 2 X 3
// 3 X 2 X 1
// 6 X 5 X 4 X