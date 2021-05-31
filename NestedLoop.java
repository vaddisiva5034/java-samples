public class NestedLoop {
    public static void main(String[] args) {
        // int numberDays = 2;

        // int day = 1;
        // int hour = 1;
        // while (day <= numberDays) {
        // while (hour <= 4) {
        // System.out.print("inner loop " + hour + " ");
        // hour++;
        // }
        // System.out.println("outerloop");
        // day++;
        // hour++;
        // }
        // System.out.println(day + " " + hour);

        // int number1 = 1234;
        // int sum = 0;
        // do {
        // sum = 0;
        // while (number1 != 0) {
        // sum += number1 % 10; // sum = sum + (number1%10) sum = 0 +(4)
        // number1 /= 10; // numbre1=number1/10; number1 = 12
        // }
        // number1 = sum;
        // } while (sum >= 10);

        // // sum = 10 number1=10
        // System.out.println(sum);

        // int number = 10;
        // while (number > 10) {
        // System.out.println("hello");
        // }

        // do {
        // System.out.println("hello");
        // } while (number > 10);

        int cnumber = 8;
        int i = 2;
        int count = 0;
        while (i < cnumber) { // 4
            if (i == 2) { // 3
                i++; // 3
                continue;
            }
            if (cnumber % i == 0) {
                count++; // i 2
                break;
            }
            i++;
        }
        System.out.println(i); // 4
        if (count == 0) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }

        int[] monthDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 30 };
        // month : 5
        // date: 28
        // next : 6

        // 29-5 , 30-5 , 31-5 ,1-6, 2-6,3-6

        // int rnumber=27;
        // 3

        // 81 ++;
        // 9

        // 36
        // 4

    }

    // 10)1234(123 1230---------
}

// 1 2 3 4 5 6 7 => 1 X 7

// 24
// 365

// 31

// 1 2 3..24

// 1 2 3..24
