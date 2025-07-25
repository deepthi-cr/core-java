// Class 1
class Student {
    static String name = "Alice";
    static int age = 20;

    static void printDetails() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

// Class 2
class Teacher {
    static String subject = "Mathematics";
    static double salary = 45000.50;

    static void printDetails() {
        System.out.println("Teacher Subject: " + subject + ", Salary: " + salary);
    }
}

// Class 3
class College {
    static String collegeName = "City College";
    static int collegeCode = 101;

    static void printDetails() {
        System.out.println("College Name: " + collegeName + ", Code: " + collegeCode);
    }
}

// Class 4
class Course {
    static String courseName = "Computer Science";
    static int duration = 3;

    static void printDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " years");
    }
}

// Class 5
class Library {
    static int totalBooks = 1500;
    static boolean isOpen = true;

    static void printDetails() {
        System.out.println("Total Books: " + totalBooks + ", Library Open: " + isOpen);
    }
}

// Main class
public class StaticVariableDemo {
    public static void main(String[] args) {
        // Calling static methods to print static variables
        Student.printDetails();
        Teacher.printDetails();
        College.printDetails();
        Course.printDetails();
        Library.printDetails();
    }
}
