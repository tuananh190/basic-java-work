package luyen_tap;

import java.util.Scanner;

public class StudentAccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Student's ID: ");
        String studentId = scanner.nextLine();

        System.out.print("GPA score: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        // Tạo tài khoản
        StudentAccount account = new StudentAccount(studentName, studentId, gpa);

        // Update GPA
        System.out.print("New GPA to update: ");
        double newGpa = scanner.nextDouble();
        scanner.nextLine(); // clear buffer
        account.updateGpa(newGpa);

        // In thông tin
        account.printStudentInfo();

        scanner.close();
    }
}
