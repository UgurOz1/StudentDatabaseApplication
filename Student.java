package StudentDatabaseApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentId;
    private String courses = "";
    private double totalDebt;
    private double courseFee = 600;
    private static int id = 1000;
    private static int counter = 1;

    public Student() {
        Scanner input = new Scanner(System.in);
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        System.out.print("Enter your year: ");
        year = input.nextInt();
    }

    public void setStudentId() {
        this.studentId = year + "" + id;
        id++;
        System.out.println("Your student ID is: " + studentId);
    }

    public void enrollCourse() {
        Scanner input = new Scanner(System.in);
        List<String> selectedCourses = new ArrayList<>();
        boolean flag = true;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Welcome to the course selection screen...");

            System.out.println(
                    "\n101 - History" +
                            "\n103 - Mathematics" +
                            "\n105 - English" +
                            "\n107 - Chemistry" +
                            "\n109 - Computer Science");
            System.out.println();
            System.out.print("Press '9' to finish..\n");
            System.out.println("-----------------------------------------");
            System.out.print("\nEnter the course code you want to select: ");
            String course = input.nextLine();
            if (!selectedCourses.contains(course)) {
                selectedCourses.add(course);
                switch (course) {
                    case "101":
                        courses = courses + counter + ")History\n";
                        System.out.println("Selected courses: \n\t" + courses);
                        totalDebt = totalDebt + courseFee;
                        showDebt();
                        counter++;
                        break;
                    case "103":
                        courses = courses + counter + ")Mathematics\n";
                        System.out.println("Selected courses: \n\t" + courses);
                        totalDebt = totalDebt + courseFee;
                        showDebt();
                        counter++;
                        break;
                    case "105":
                        courses = courses + counter + ")English\n";
                        System.out.println("Selected courses: \n\t" + courses);
                        totalDebt = totalDebt + courseFee;
                        showDebt();
                        counter++;
                        break;
                    case "107":
                        courses = courses + counter + ")Chemistry\n";
                        System.out.println("Selected courses: \n\t" + courses);
                        totalDebt = totalDebt + courseFee;
                        showDebt();
                        counter++;
                        break;
                    case "109":
                        courses = courses + counter + ")Computer Science\n";
                        System.out.println("Selected courses: \n\t" + courses);
                        totalDebt = totalDebt + courseFee;
                        showDebt();
                        counter++;
                        break;
                    case "9":
                        System.out.println("Course selection completed successfully...");
                        System.out.println("-----------------------------------");
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid course code, please try again.");
                        // enrollCourse();
                        break;
                }
            } else {
                System.out.println("You have already selected this course. Please select another course...");
            }
        } while (flag);
        System.out.print("Selected courses: \n" + courses);
        showDebt();
    }

    public void showDebt() {
        System.out.println("Total debt: " + totalDebt + "TL");
    }

    public void makePayment() {
        Scanner input = new Scanner(System.in);
        // showDebt();
        System.out.println("Enter the amount you will pay: ");
        int payment = input.nextInt();
        if (totalDebt >= payment) {
            totalDebt = totalDebt - payment;
            System.out.println("The amount you paid is " + payment + "TL");
            showDebt();
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Do not enter a number greater than your debt...");
            makePayment();
        }
    }

    @Override
    public String toString() {
        return "Name Surname: " + firstName + " " + lastName + "\n" + "Year: " + year +
                "\n" + "Student ID: " + studentId +
                "\n" + "Enrolled courses: " + courses +
                "\nRemaining debt: " + totalDebt + "\n-------------------------\n";
    }
}
