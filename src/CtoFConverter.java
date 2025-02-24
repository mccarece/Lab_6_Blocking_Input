import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean done;
        double celsius;

        do {
            System.out.print("Enter temp. in celsius: ");
            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
                done = true;
            } else {
                System.out.println("Invalid input");
                System.out.print("please enter a numeric value. \n");
                done = false;
                in.next();
            }

        }
        while(!done);
    }
}
