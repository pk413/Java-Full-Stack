package Hello.World;

import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private double feesPaid;
    private double feesTotal;
    
    public Student(int id, String name, double feesTotal) {
        this.id = id;
        this.name = name;
        this.feesPaid = 0;
        this.feesTotal = feesTotal;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getFeesPaid() {
        return feesPaid;
    }
    
    public double getFeesTotal() {
        return feesTotal;
    }
    
    public void payFees(double fees) {
        feesPaid += fees;
    }
    
    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }
    
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Fees Paid: " + feesPaid);
        System.out.println("Fees Total: " + feesTotal);
        System.out.println("Remaining Fees: " + getRemainingFees());
    }
}

class School {
    private ArrayList<Student> students;
    
    public School() {
        students = new ArrayList<>();
    }
    
    public void addStudent(int id, String name, double feesTotal) {
        students.add(new Student(id, name, feesTotal));
    }
    
    public void payFees(int id, double fees) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.payFees(fees);
                return;
            }
        }
        System.out.println("Student not found");
    }
    
    public void displayInfo(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found");
    }
}

public class SimpleManagementSystem {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(1, "John Doe", 10000);
        school.addStudent(2, "Jane Doe", 20000);
        school.payFees(1, 5000);
        school.displayInfo(1);
        school.displayInfo(2);
    }
}
