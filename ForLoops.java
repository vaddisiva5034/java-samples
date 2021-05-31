public class ForLoops {
    public static void main(String[] args) {
        // int i = 1;
        // while (++i <= 10) {
        // System.out.println(i);
        // i++;
        // }
        // System.out.println(i); //
        // int i = 1;
        // for (int i = 0; i < 10; i++) {

        // for (int j = 0; j <= 10; j++) {

        // System.out.println(j);
        // }
        // }
        //
        // for (int j = 0; j <= 10; j++) {
        // System.out.println(j);
        // }

        // j
        // int i, j;
        // for (i = 10; i >= 1; i--) {
        // for (j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println("");
        // }

        int i, j;
        int n = 10;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == i || j == n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // }
        //
        // }
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// *********