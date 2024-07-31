import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        double score = scanner.nextDouble();
        if ((score > 79) && (score < 101)) {
            System.out.println("You got grade A");
        }
        else if ((score > 74) && (score < 80)) {
            System.out.println("You got grade B+");
        }
        else if ((score > 69) && (score < 75)) {
            System.out.println("You got grade B");
        }
        else if ((score > 64) && (score < 70)) {
            System.out.println("You got grade C+");
        }
        else if ((score > 59) && (score < 65)) {
            System.out.println("You got grade C");
        }
        else if ((score > 54) && (score < 60)) {
            System.out.println("You got grade D+");
        }
        else if ((score > 49) && (score < 55)) {
            System.out.println("You got grade D");
        }
        else if (score < 50) {
            System.out.println("You got grade E");
        }else{
            System.out.println("please enter score 1-100");
        }
        scanner.close();
    }
}
