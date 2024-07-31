import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = scanner.nextInt();
        String grade = thinkGrade(score);
        System.out.println("Your grade is:" + grade);
        scanner.close();
    }

    public static String thinkGrade(int score) {
        if (score < 0 || score > 100) {
            return "Score must be within the range 0-100";
        } else if ((score >= 80) && (score <= 100)) {
            return "A";
        } else if ((score >= 75) && (score <= 80)) {
            return "B+";
        } else if ((score >= 70) && (score <= 75)) {
            return "B";
        } else if ((score >= 65) && (score <= 69)) {
            return "C+";
        } else if ((score >= 60) && (score <= 64)) {
            return "C";
        } else if ((score >= 55) && (score <= 60)) {
            return "D+";
        } else if ((score >= 50) && (score <= 54 )) {
            return "D";
        } else {
            return "E";
        }
    }
}