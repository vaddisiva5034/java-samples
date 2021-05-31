class AssignmentOperator {
    public static void main(String[] args) {
        int a;
        a = 10;
        int b;
        b = a; // b = 10
        b = b + a; //
        b = b + 11; // 20
        // 31

        int total = 0;
        int kiran = 20, lucky = 100, vamsi = 80, srinu = 99;
        total = total + kiran; // 20
        total += kiran; // total = total + kiran;
        total = total - lucky; // 120
        total -= lucky; //
        total = total + vamsi;
        total = total + srinu;

        int srinuHeight = 10, rakesheight = 1;

        boolean isSrinuLessThanrakesh = srinuHeight < rakesheight; // fasle
        boolean isSrinuLessThanrakesh1 = srinuHeight <= rakesheight; // true
        boolean isSrinuLessThanrakesh2 = srinuHeight == rakesheight; // true
        boolean isSrinuLessThanrakesh3 = srinuHeight > rakesheight; // false
        boolean isSrinuLessThanrakesh4 = srinuHeight >= rakesheight; // true
        boolean isSrinuLessThanrakesh5 = srinuHeight != rakesheight; // false
        boolean isSrinuLessThanrakesh6 = (srinuHeight < rakesheight) && (srinuHeight <= rakesheight);
        boolean isSrinuLessThanrakesh9 = !(srinuHeight < 11);

        int number = 6;
        int intdiv = number / 2; // 3
        double doubleDiv = number / 2; // 3.0

        int highest = (srinuHeight > rakesheight) ? srinuHeight : rakesheight;
        String message = (doubleDiv - intdiv == 0) ? "is even" : "is odd";
        System.out.println(message);
        System.out.println(highest);

        // || ,
        // && ,
        // !

        // <
        // >
        // <=
        // >=
        // ==
        // !=

    }

}
