public class Case8 {
    public static void main(String[] args) {
        
        int score = 67;  // enter your score in line
        
        if (score < 0 || score >= 101) {
            System.out.println("Score must be within the range 0-100");
        }
        else if (score > 79) {
            System.out.println("You got grade A");
        } else if (score > 74) {
            System.out.println("You got grade B+");
        } else if (score > 69) {
            System.out.println("You got grade B");
        } else if (score > 64) {
            System.out.println("You got grade C+");
        } else if (score > 59) {
            System.out.println("You got grade C");
        } else if (score > 54) {
            System.out.println("You got grade D+");
        } else if (score > 49) {
            System.out.println("You got grade D");
        } else {
            System.out.println("You got grade E");
        }
    }
}
