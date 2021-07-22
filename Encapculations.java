class Recatangle {
    int length;
    int with;
    int sceret = 10;

    void calculateArea() {
        System.out.println(this.length * this.with * this.sceret);
    }

}

class Employee {
    private int daySlary = 200;
    private int noOfDays;
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("the name is updated to " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setDaySalary(int daySalary) {
        this.daySlary = daySalary;
        System.out.println("the salry is updated by" + this.name);
    }

    void calculatSalary() {
        System.out.println(this.daySlary * this.noOfDays);
    }

}

public class Encapculations {

    public static void main(String[] args) {
        Recatangle obj = new Recatangle();
        obj.length = 10;
        obj.with = 30;
        Employee obj1 = new Employee();
        obj1.setName("rakenh");
        obj1.setDaySalary(2000);

    }
}
