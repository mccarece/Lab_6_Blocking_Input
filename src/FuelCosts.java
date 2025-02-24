import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean gallonsDone;
        boolean mpgDone;
        boolean priceDone;
        double gallons = 0;
        double mpg = 0;
        double gasPrice = 0;

        do {
            System.out.print("gallons of gas your tank can hold: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                gallonsDone = true;
            } else {
                    System.out.println("Invalid input for gallons.");
                    System.out.println("Please re-enter.\n");
                    gallonsDone = false;
                    in.next();
                    }
        }
        while(!gallonsDone);

        do {
            System.out.println("miles per gallon your car gets: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                mpgDone = true;
            } else {
                System.out.println("Invalid input for gallons.");
                System.out.println("Please re-enter.\n");
                mpgDone = false;
                in.next();
            }
        }
        while(!mpgDone);

        do {
            System.out.println("Price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                priceDone = true;
            } else {
                System.out.println("Invalid input for price.");
                System.out.println("Please re-enter.\n");
                priceDone = false;
                in.next();
            }
        }
        while(!priceDone);


        double totalGas = 100 / mpg;
        double totalGasCost = totalGas * gasPrice;
        double totalDistance = gallons * mpg;
        System.out.printf("\nto drive 100 miles it would cost you %.2f $.%n", totalGasCost);
        System.out.printf("on a full tank of gas you could travel a total of %.2f miles.%n", totalDistance);
    }
}
