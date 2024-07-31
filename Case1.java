import java.util.Scanner;

public class Case1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        double score = scanner.nextDouble();
        if ((score >= 80) && (score <= 100) ) {
            System.out.println("You got grade A");
        }
        else if ((score >= 75) && (score <= 79)) {
            System.out.println("You got grade B+");
        }
        else if ((score >= 70) && (score <= 75)) {
            System.out.println("You got grade B");
        }
        else if ((score >= 65) && (score <= 69)) {
            System.out.println("You got grade C+");
        }
        else if ((score >= 60) && (score <= 64)) {
            System.out.println("You got grade C");
        }
        else if ((score >= 55) && (score <= 60)) {
            System.out.println("You got grade D+");
        }
        else if ((score >= 50) && (score <= 54)) {
            System.out.println("You got grade D");
        }
        else if (score <= 49) {
            System.out.println("you didn't pass");
        }else{
            System.out.println("please enter score 1-100");
        }
        scanner.close();
    }
}