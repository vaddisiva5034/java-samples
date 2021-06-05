import java.util.Scanner;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNum = scanner.nextInt();
        for (int i = 2; i < targetNum; i++) {
            if (targetNum % i == 0) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
