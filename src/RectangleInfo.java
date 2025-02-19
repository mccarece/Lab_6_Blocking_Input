import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean doneWidth;
        boolean doneHeight;

        do {
            System.out.print("Enter height of rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                doneHeight = true;
            } else {
                System.out.print("Error: invalid width");
                System.out.print("please re-enter a number.\n");
                doneHeight = false;
            }
        }while(!doneHeight);

        do {
            System.out.print("Enter width of rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                doneWidth = true;
            } else {
                System.out.print("Error: invalid width");
                System.out.print("please re-enter a number.\n");
                doneWidth = false;
            }
        }while(!doneWidth);

        double perimeter = ((width * 2) + (height * 2));
        double expoWidth = Math.pow(width, 2);
        double expoHeight = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(expoWidth + expoHeight);
        System.out.println("Perimeter of rectangle: " + perimeter);
        System.out.printf("the length of the diagonal is: %.2f%n", hypotenuse);
    }
}
