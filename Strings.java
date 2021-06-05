import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // sentence no vowels
        // my name is java
        // name
        // myString name = scanner.nextLine();
        // String[] dates = name.split("/");
        // System.out.println(dates[0]); // day
        // System.out.println(dates[1]); // month
        // System.out.println(dates[2]); // year
        // char[] chArry = name.toCharArray();
        // int count = 0;
        // // boolean isLucky = false;
        // for (int i = 0; i < chArry.length; i++) {
        // if (chArry[i] == 'a' || chArry[i] == 'e' || chArry[i] == 'i' || chArry[i] ==
        // 'o' || chArry[i] == 'u') {
        // count++;
        // }
        // }

        // System.out.println(count);

        String sentence = scanner.nextLine();
        String targetWord = scanner.nextLine();
        String[] words = sentence.split(" ");
        // sentence.

        //word
        //
        for (String word : words) {
            if (word.equalsIgnoreCase(targetWord)) {
                System.out.println("found");
                break;
            }

        }
        // if (isLucky) {
        // System.out.println("lucky");
        // } else {
        // System.out.println("no lucky");
        // }
        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(numbers[0]);
        // System.out.println(chArry[0]);
        // btw
        // wer
        // a e i o u
        // String upName = name.toUpperCase();
        // name = name.toUpperCase();
        // System.out.println(name.toUpperCase());
        // System.out.println(name);
        // if (name.length() > 5) {
        // System.out.println("failed");
        // } else {
        // System.out.println("passed");
        // }

    }
}

// ab,c,d
// [ab,c,d]