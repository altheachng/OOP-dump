import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StudentInformationSystem {
    private String name;
    private int age;
    private double grade;


    public StudentInformationSystem(String name, int age, double  grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age>0){
            this.age = age;
        }else{
            System.out.println("Invalid age, Age must be positive...");
        }
    }


    public void setGrade(double grade){
        if (grade>=0 && grade <=100){
            this.grade = grade;
        }else{
            System.out.println("Invalid Grade....Must be from 0 to 100");
        }
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<StudentInformationSystem> students = new ArrayList<>();

        while (true) {
            System.out.print("Enter Name (or type 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // clear buffer

            // Create a new StudentInformationSystem object and add it to the list
            students.add(new StudentInformationSystem(name, age, grade));
        }

        // Display all students' details
        for (StudentInformationSystem student : students) {
            student.displayDetails();
        }
    }
}