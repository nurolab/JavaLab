public class Student {
    int id;
    static int numStudents = 0;
    String name;
    int marks;
    public Student(String s, int i, int m){
        this.marks = m;
        this.id = i;
        this.name = s; 
        numStudents++;
    }
    public Student(String s, int i){
        this.name = s;
        this.id = i;
        numStudents++;
    }
    public Student(String s){
        this.name = s;
        numStudents++;
    } 
    public Student(){
        numStudents++;
    }
    public void show(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("Strength: " + numStudents);
    }
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("Deepak");
        Student student3 = new Student("Rahul", 1234);
        Student student4 = new Student("Ankit", 1234, 90);
        student1.show();
        student2.show();
        student3.show();
        student4.show();  
    }
}
