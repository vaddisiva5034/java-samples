import java.util.Scanner;

class DateProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dates = date.split("/");

        int day = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);

        int year = Integer.parseInt(dates[2]);

        int[] noOfMonthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int noOfDays = scanner.nextInt();

        for (int i = 0; i < noOfDays; i++) {
            day++;
            if (day > noOfMonthDays[month - 1]) {
                day = 1;
                month++;
            }
            if (month > 12) {
                month = 1;
                year++;
            }
            System.out.println(day + "/" + month + "/" + year);
        }

    }
}