interface IProgrammingLanguage {
    void printVersion();

    void printCompilerType();
}

interface IProgrammingLanguage1 {
    void printVersion();
}

class AA {
    void printVersion() {
        System.out.println("version 1");
    }
}

class BB {
    void printVersion() {
        System.out.println("version 2");
    }
}

class Java implements IProgrammingLanguage, IProgrammingLanguage1 {

    @Override
    public void printVersion() {
        System.out.println("java version : 11.0.12");
    }

    @Override
    public void printCompilerType() {
        System.out.println("java version : jdk");

    }

}

class Paython implements IProgrammingLanguage {

    @Override
    public void printVersion() {
        System.out.println("python version : 3.0.12");

    }

    @Override
    public void printCompilerType() {
        System.out.println("python ide");

    }

}

public class InterfacesExample {

    public static void main(String[] args) {
        IProgrammingLanguage obj = new Paython();
        obj.printVersion();
    }
}
