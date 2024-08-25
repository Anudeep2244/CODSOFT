import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sub_marks;
        int total_marks = 0;
        double avg;
        String grade;
        System.out.println("*** Student Grade Calculator ***");
        System.out.print("Enter the number of subjects : ");
        int num_of_sub = scanner.nextInt();
        System.out.println("Enter the marks of each subject (out of 100).");

        int i = 0;
        while (i < num_of_sub) {
            System.out.print("Enter the marks of subject " + (i+1) + ": ");
            sub_marks = scanner.nextInt();
            if (0 <= sub_marks && sub_marks <= 100) {
                total_marks += sub_marks;
                i++;
            }
            else {
                System.out.println("Invalid input, marks should be in range 0-100.");
            }
        }

        avg = (float)total_marks / (float)num_of_sub;

        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B+";
        } else if (avg >= 60) {
            grade = "B";
        } else if (avg >= 50) {
            grade = "C";
        } else if (avg >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks : " + total_marks);
        System.out.printf("Total Pecentage : %.2f%%\n",avg);
        System.out.println("Grade : " + grade);

        scanner.close();
    }
}
