class Student {
static String name = "navy";
static int age = 20;
static String grade = "A";
static String school = "Greenwood";
static boolean isActive = true;

 void showStudentInfo() {
 String name = "kushi";
 int age = 18;
 String grade = "B";
 String school = "Local School";
 boolean isActive = false;

System.out.println("Student (Static): " + Student.name + ", " + Student.age + ", " + Student.grade + ", " + Student.school + ", " + Student.isActive);
System.out.println("Student (Local): " + name + ", " + age + ", " + grade + ", " + school + ", " + isActive);
    }
}
class Teacher {
    static String name = "StaticTeacher";
    static int id = 101;
    static String subject = "Math";
    static int experience = 5;
    static boolean fullTime = true;

    void showTeacherInfo() {
        String name = "LocalTeacher";
        int id = 202;
        String subject = "Science";
        int experience = 3;
        boolean fullTime = false;

        System.out.println("Teacher (Static): " + Teacher.name + ", " + Teacher.id + ", " + Teacher.subject + ", " + Teacher.experience + ", " + Teacher.fullTime);
        System.out.println("Teacher (Local): " + name + ", " + id + ", " + subject + ", " + experience + ", " + fullTime);
    }
}
class Book {
    static String title = "StaticTitle";
    static String author = "StaticAuthor";
    static int pages = 200;
    static boolean isAvailable = true;
    static double price = 499.99;

    void showBookInfo() {
        String title = "LocalTitle";
        String author = "LocalAuthor";
        int pages = 150;
        boolean isAvailable = false;
        double price = 299.99;

        System.out.println("Book (Static): " + Book.title + ", " + Book.author + ", " + Book.pages + ", " + Book.isAvailable + ", " + Book.price);
        System.out.println("Book (Local): " + title + ", " + author + ", " + pages + ", " + isAvailable + ", " + price);
    }
}
class Library {
    static String name = "Central Library";
    static String city = "Delhi";
    static int totalBooks = 1000;
    static boolean isOpen = true;
    static String librarian = "Mr. Kumar";

    void showLibraryInfo() {
        String name = "Local Library";
        String city = "Mumbai";
        int totalBooks = 500;
        boolean isOpen = false;
        String librarian = "Ms. Nisha";

        System.out.println("Library (Static): " + Library.name + ", " + Library.city + ", " + Library.totalBooks + ", " + Library.isOpen + ", " + Library.librarian);
        System.out.println("Library (Local): " + name + ", " + city + ", " + totalBooks + ", " + isOpen + ", " + librarian);
    }
}
public class MainApp {
    public static void main(String[] args) {
        Student student = new Student();
        student.showStudentInfo();

        System.out.println("----------------------");

        Teacher teacher = new Teacher();
        teacher.showTeacherInfo();

        System.out.println("----------------------");

        Book book = new Book();
        book.showBookInfo();

        System.out.println("----------------------");

        Library library = new Library();
        library.showLibraryInfo();
    }
}
