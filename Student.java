package Act3;

public class Student {
    private String name;
    private String id;
    private double GPA;

    public Student() {
        this.name = "";
        this.id = "";
        this.GPA = 0.0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + GPA);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("John");
        student1.setId("12345");
        student1.setGPA(3.8);
        student2.setName("Priya");
        student2.setId("54321");
        student2.setGPA(4.5);
        student1.displayInfo();
        student2.displayInfo();
    }
}