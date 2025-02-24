import java.util.*;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        boolean done = false;
        int guess = 0;
        int answer = generator.nextInt(10) + 1;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();

                if (guess > answer) {
                    System.out.println("Your guess is too high!\n");
                } else if (guess < answer) {
                    System.out.println("Your guess is too low!\n");
                } else {
                    System.out.println("CORRECT!!!!\nThe answer is: " + answer);
                    done = true;
                }
            } else {
                System.out.println("You entered an invalid number!\n");
                in.next();
            }
        } while (!done);
    }
}
