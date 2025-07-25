public class Class8 {
static String internName;
static int internId;
static String internCompany = "Microsoft";
static int internStipend;
static boolean internGettingJob = true;

public static void main(String[] args) {
//String internName = "Deepthi";
System.out.println("Intern name: " + internName);
internName = "Deepthi";
System.out.println(internName);
internId = 11;
System.out.println(internId);
System.out.println(internCompany);
internStipend = 15000;
System.out.println(internStipend);
System.out.println(internGettingJob);
Intern();
Intern1();
Intern2();
Intern3();
}

public static void Intern() {
System.out.println(internName + " got selected for internship of the company " + internCompany);
}
public static void Intern1() {
System.out.println(internCompany + " company giving Stipend of " + internStipend + " rupees ");
}
public static void Intern2() {
System.out.println("In Microsoft company for interns they provided intern ID: " + internId);
}
public static void Intern3() {
System.out.println("After internship " + internName + " will get job: " + internGettingJob);
}
}