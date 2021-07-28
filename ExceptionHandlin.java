class CustomException extends Exception {
    String message;

    CustomException(String msg) {
        super(msg);
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}

public class ExceptionHandlin {
    public static int divide(int a, int b) throws CustomException {

        if (b == 0) {
            throw new CustomException("number should not be zero");
        }
        return a / b;

    }

    public static void main(String[] args) {
        try {
            divide(1, 0);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

        try {
            try {
                String a = "123aa";
                int result = Integer.parseInt(a);
                System.out.println(result + 10);
            } catch (NumberFormatException ex) {
                System.out.println("give a valid number");
            }
            try {
                int i = 1;
                int[] arr = { 1 };
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
                System.out.println("give a valid index");
            }
            System.out.println(10 / 0);

        } catch (Exception ex) {
            System.out.println("some exception");
        } finally {
            System.out.println("check final");
        }
        System.out.println("hello");
    }
}
