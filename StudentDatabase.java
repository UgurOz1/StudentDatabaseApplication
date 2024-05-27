package StudentDatabaseApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("************WELCOME TO THE COURSE SELECTION SCREEN************");

        int i = 0;
        while (true) {
            students.add(new Student());
            students.get(i).setStudentId();
            students.get(i).enrollCourse();
            students.get(i).makePayment();
            System.out.println("Press '0' to exit...\nPress '1' to continue...");
            String exit = input.nextLine();
            if (exit.equals("0")) {
                //System.out.println(students.get(i).toString());
                System.out.println(students);

                System.out.println("YOUR TRANSACTIONS HAVE BEEN SUCCESSFULLY COMPLETED...\nHAVE A NICE DAY:))))");
                break;
            } else if (exit.equals("1")) {
                i++;
            } else {
                System.out.println("Invalid input, please try again.");
                return;
            }
        }
    }
}
