import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Score : ");
        int score = scanner.nextInt();
        if (score<0 || score>100) {
            System.out.println("please enter score 1-100");
        }else if (score >= 80) {
            System.out.println(" grade A");
        } else if (score >= 75)  {
            System.out.println("grade B+");
        } else if (score >= 70) {
            System.out.println("grade B");
        } else if (score >= 65)  {
            System.out.println(" grade C+");
        } else if (score >= 60) {
            System.out.println("grade C");
        } else if (score >= 55){
            System.out.println("grade D+");
        } else if (score >= 50) {
            System.out.println("grade D");
        } else if (score < 49) {
            System.out.println("you didn't pass");
        }
        scanner.close();
           
    }
}
