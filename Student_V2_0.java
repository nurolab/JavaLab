public class Student_V2_0 {
    private int id;
    private String name;
    private int marks;
    private static int numStudents = 0;

    public Student_V2_0() {
        this("Unknown");
    }

    public Student_V2_0(String name) {
        this(name, 0);
    }

    public Student_V2_0(String name, int id) {
        this(name, id, 0);
    }

    public Student_V2_0(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        numStudents++;
    }

    public void show() {
        System.out.println("------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("Strength: " + numStudents);
    }

    public static void main(String[] args) {
        Student_V2_0 student1 = new Student_V2_0();
        Student_V2_0 student2 = new Student_V2_0("Deepak");
        Student_V2_0 student3 = new Student_V2_0("Rahul", 1234);
        Student_V2_0 student4 = new Student_V2_0("Ankit", 1234, 90);
        
        student1.show();
        student2.show();
        student3.show();
        student4.show();
    }
}
