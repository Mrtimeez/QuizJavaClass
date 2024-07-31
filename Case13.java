import java.util.Scanner;

public class Case13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Score : ");
        double score = scanner.nextDouble();
        if ((score != 79) && !(score >= 80) ) {
            System.out.println("You got grade A");
        }
        else if ((score != 74) && !(score >= 79)) {
            System.out.println("You got grade B+");
        }
        else if ((score != 69) && !(score >= 70)) {
            System.out.println("You got grade B");
        }
        else if ((score != 64) && !(score >= 65)) {
            System.out.println("You got grade C+");
        }
        else if ((score != 59) && !(score >= 60)) {
            System.out.println("You got grade C");
        }
        else if ((score != 54) && !(score >= 55)) {
            System.out.println("You got grade D+");
        }
        else if ((score != 49) && !(score >= 50)) {
            System.out.println("You got grade D");
        }
        else {
            System.out.println("you got grade E");
        }
        scanner.close();
    }
}