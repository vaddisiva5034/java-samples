interface Ab {
    String log(String a, int b);

    void log2();
}

class BB implements Ab {
    void log3() {
        System.out.println("hello bb from log3");
    }

    @Override
    public String log(String a, int b) {
        System.out.println("hello bb from log");
        return null;
    }

    @Override
    public void log2() {
        System.out.println("hello bb from log1");

    }
}

class CC implements Ab {

    @Override
    public String log(String a, int b) {
        System.out.println("hello cc from log");
        return null;
    }

    @Override
    public void log2() {
        System.out.println("hello cc from log1");

    }

}

class DD {
    public String log(String a, int b) {
        System.out.println("hello cc from log");
        return null;
    }

    public void log2() {
        System.out.println("hello cc from log1");

    }
}

public class AbstractExp {
    public static void main(String[] args) {
        Ab b = new CC();
        b.log("", 0);
        b.log2();

    }
}
