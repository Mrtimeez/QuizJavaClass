import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Please enter your score 1-100:");

        int score = scanner.nextInt();
        String grade;

        if (score !=0 && score >= 80 && score<=100) {
            grade = "A";
        }else if (score !=0 && score >= 75 && score<=100) {
            grade = "B+";
        }else if (score !=0 && score >= 70 && score<=100) {
            grade = "B";
        }else if (score !=0 && score >= 65 && score<=100) {
            grade = "C+";
        }else if (score !=0 && score >= 60 && score<=100) {
            grade = "C";
        }else if (score !=0 && score >= 55 && score<=100) {
            grade = "D+";
        }else if (score !=0 && score >= 50 && score<=100) {
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("your grade is " + grade);
        scanner.close();
    }
}
