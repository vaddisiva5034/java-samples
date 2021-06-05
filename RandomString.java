import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shoulContinue = true;
        Random rand = new Random();
        while (shoulContinue) {
            int randomNumber = rand.nextInt(6);
            System.out.println("random number is :" + randomNumber);
            System.out.println("would like to continue : y/n");
            String c = scanner.nextLine();
            c = c.toLowerCase();
            if (c.equals("y")) {
                continue;
            }
            shoulContinue = false;
        }
        System.out.println("end of the game");
    }
}
