class StudentOverloading {
    // properties id name marks
    int id;
    String name;
    int marks;

    public StudentOverloading() {

    }

    public StudentOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentOverloading(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    // default constructor
    // id name
    // id name marks

    // getId()
    public int getId() {
        return this.id;
    }

    // getId(name) => if name sent is equal to name in the objet then send the id or
    // return 0

    public int getId(String name) {
        if (name.equals(this.name)) {
            return this.id;
        }
        return 0;
    }

    // getId(marks) => if marks sent is equal to marks in the objet then send the id
    // or return 0

    public int getId(int marks) {
        if (this.marks == marks) {
            return this.id;
        }
        return 0;
    }

}

class Check {
    public static void main(String[] args) {
        StudentOverloading obj = new StudentOverloading(10, "kiran", 25);
        System.out.println(obj.getId(25));
    }
}
