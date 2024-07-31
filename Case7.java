public class Case7 {
    public static void main(String[] args) {
        
        int score = 67;  // enter your score in line
        
        if (score < 0 || score > 100) {
            System.out.println("Score must be within the range 0-100");
        }
        else if (score >= 80) {
            System.out.println("You got grade A");
        } else if (score >= 75) {
            System.out.println("You got grade B+");
        } else if (score >= 70) {
            System.out.println("You got grade B");
        } else if (score >= 65) {
            System.out.println("You got grade C+");
        } else if (score >= 60) {
            System.out.println("You got grade C");
        } else if (score >= 55) {
            System.out.println("You got grade D+");
        } else if (score >= 50) {
            System.out.println("You got grade D");
        } else {
            System.out.println("You got grade E");
        }
    }
}
