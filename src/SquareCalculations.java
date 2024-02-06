import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        int sideLength;
        int perimeter, area;

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the length of the square's side: ");
        sideLength = scanner.nextInt();

        // Calculate perimeter
        perimeter = 4 * sideLength;

        // Calculate area
        area = sideLength * sideLength;

        // Print the square's perimeter and area
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);

        scanner.close();
    }
}