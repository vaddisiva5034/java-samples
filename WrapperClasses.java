public class WrapperClasses {
    public static int getConcat(Integer number, Integer number2) {
        if (number == null || number2 == null) {
            return -1;
        }
        Integer result = number;
        // int length = 0;
        // int temp = number;
        // while (number != 0) {
        // length++;
        // number /= 10;
        // }
        // number = temp;
        // number *= Math.pow(10, length);
        // result = number + number2;
        // Integer tempNum1 = number;
        // Integer tempNum2 = number2;
        String tempResult = number.toString() + number2.toString();
        result = Integer.parseInt(tempResult);
        return result;
    }

    public static void main(String[] args) {
        // numb1 == 100;
        // number2 = 200;
        int result = getConcat(null, 20); // 1020
        // Integer result;
        System.out.println(result);

        // String s = new String("sdnalkl");
        // System.out.println(s);
        // float c = 10.12f;
        // Float a1 = new Float(c); // boxing
        // Float a3 = c; // auto boxing
        // a3 = 12.45f;
        // c = a3; // auto unboixing

        // Double a2=new Double(10.12);
        // Short s;
        // Byte b;
        // Long sa;
        // Integer i1;
        // Character c1;
        // Boolean b;

    }
}
