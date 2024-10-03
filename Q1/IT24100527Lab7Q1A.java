import java.util.Scanner;

public class IT24100527Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] marks = new int[4];
        int total = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark " + (i+1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }
        
        double average = total / 4.0;
        System.out.println("\nAverage is: " + average);
        
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Overall Grade is: " + grade);
        
        input.close();
    }
}
