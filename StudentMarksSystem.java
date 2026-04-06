import java.util.*;
public class StudentMarksSystem {
    static Scanner sc = new Scanner(System.in);
    static int[] marks = new int[5];
    static boolean isEntered = false;
    static void enterMarks() {
        System.out.println("Enter marks for  students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        isEntered = true;
    }
    static void displayMarks() {
        if (!isEntered) {
            System.out.println("Please enter marks first!");
            return;
        }
        System.out.println("Marks are:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
    static void totalMarks() {
        if (!isEntered) {
            System.out.println("Please enter marks first!");
            return;
        }
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        System.out.println("Total Marks = " + sum);
    }
    static void averageMarks() {
        if (!isEntered) {
            System.out.println("Please enter marks first!");
            return;
        }
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        System.out.println("Average Marks = " + (sum / (double) marks.length));
    }
    static void highestMark() {
        if (!isEntered) {
            System.out.println("Please enter marks first!");
            return;
        }
        int max = Arrays.stream(marks).max().getAsInt();
        System.out.println("Highest Mark = " + max);
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Total Marks");
            System.out.println("4. Average Marks");
            System.out.println("5. Highest Mark");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    enterMarks();
                    break;
                case 2:
                    displayMarks();
                    break;
                case 3:
                    totalMarks();
                    break;
                case 4:
                    averageMarks();
                    break;
                case 5:
                    highestMark();
                    break;
                case 6:
                    System.out.println("Program Ended.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}