import java.util.Scanner;

public class SubParandrom {

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += Character.toString(s.charAt(i));
        }
        return result;

    }

    // o(n) =>
    // 1 => 1, 2 => 8 , 3 => 27 , 4
    /// O(n3)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 1
        // [1,2,4,4,5,7,9] // 9
        // int num = scanner.nextInt(); // 1s
        // for (int i = 0; i <= num; i++) // O(n)
        // {
        // for (int j = 0; j <= num; j++) // O(n)
        // {
        // System.out.println(i);
        // }

        // }
        // 1 + 1 + (o(n)*O(n)) // O(n)
        String word = "google";
        // 1+1+O(n)=>O(n)
        char[] chArry = word.toCharArray();
        for (int tempi = 1; tempi < chArry.length - 1; tempi++) {
            int i = tempi;
            int j = i - 1;
            if (j >= 1 && chArry[i] != chArry[j] && chArry[i] == chArry[j - 1]) {
                j -= 1;
            }
            while (i < chArry.length && j >= 0 && chArry[i] == chArry[j]) {
                System.out.println(word.substring(j, i + 1));
                j--;
                i++;

            }
        }
        // // }
        // for (int i = 0; i < chArry.length - 1; i++) {

        // for (int j = i + 1; j < chArry.length; j++) {
        // String temp = word.substring(i, j + 1);
        // String temp2 = reverse(temp);
        // if (temp.equals(temp2)) {
        // System.out.println(temp);
        // }
        // }
        // }
    }
}

// geeks

// googoog
