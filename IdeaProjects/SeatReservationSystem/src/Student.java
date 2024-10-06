import java.util.Scanner;

public class Student {
    // Attributes of student
    private String name;
    private int studNumber;
    private double Score;

    // Constructor
    public Student() {
        this.name = "";
        this.studNumber = 0;
        this.Score = 0.00;
    }

    // Setters - used to change data
    public void setName(String name) {
        this.name = name;
    }

    public void setStudNumber(int studNumber) {
        this.studNumber = studNumber;
    }

    public void setScore(double score) {
        this.Score = score;
    }

    // Getters - used to access data
    public String getName() {
        return this.name;
    }

    public int getStudNumber() {
        return this.studNumber;
    }

    public double getScore() {
        return this.Score;
    }

    // Custom methods
    public void study() {
        System.out.println(this.name + " studies very well.");
    }

    public void play(double money) {
        System.out.println(this.name + " needs " + money + " to play.");
    }

    public boolean doChores() {
        boolean done = false;

        return done;
    }
}

