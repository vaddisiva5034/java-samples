import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of student :");
        int n = scanner.nextInt();
        /// n = 3

        int[][] matks = new int[n][2];
        // meory 4 * 3 *2 == 12bytes

        // [100,23,4,5,1213,124];
        // []
        //
        for (int i = 0; i < matks.length; i++) {
            System.out.println("enter the " + (i + 1) + "student marks : ");
            matks[i][0] = scanner.nextInt();
            matks[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < matks.length; i++) {
            int marks = matks[i][0];
            if (marks <= 100 && marks >= 70) {
                System.out.println("stunet " + (i + 1) + "Grade: A");
            } else if (marks < 70 && marks >= 35) {
                System.out.println("stunet " + (i + 1) + "Grade: B");
            } else {
                System.out.println("stunet " + (i + 1) + "Grade: C");
            }
        }
        // int studetNo;
        // int a = 10;
        // String[] months = new String[] { "Jan", "Feb", "Mar", "Apr", "May" };
        // a = 20;
        // // a
        // for (int i = 0; i < months.length; i++) {
        // months[i] = "jan";
        // }

        // for (int i = 0; i < months.length; i++) {
        // System.out.println(months[i]);
        // }

        // studentsRollNos
        // 80
        // 68
        // 12

        // studnet 1 grande : A
        // student 2 grande
        // 70 - 100 - A
        // 35 - 70 - B
        // 35 - C
        // int 10
        // eter the 1 stuent matks = 1
        // eter the 2 stuent matks =
        // 1 student per:
        // int[] studentsRollNos = new int[10];
        // String[] studentsNames = new String[10];
        // double[] studentPercentenge = new double[10];
        // studentsRollNos[0] = 10; // 1st block
        // studentsRollNos[3] = 20; // 4nd block
        // studentsRollNos[9] = 30; // 11 nd block
        // int sum = studentsRollNos[0] + studentsRollNos[3];

    }
}

// //
// address:1000
// address+0 ==>
