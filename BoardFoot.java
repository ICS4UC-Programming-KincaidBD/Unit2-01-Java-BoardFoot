//1 board foot = 144 inches^3 (12in x 12in long x 1in thick)
// Calculate length, so every result is exactly 1 board foot
// return board foot value
import java.util.Scanner;
public class BoardFoot {
    public static double CalculateBoardFoot(double width, double height) {
        final double board_foot_inches = 144;

        if (width <= 0 || height <= 0) {
            System.out.println("Enter a positive value for width and height");
            return 0.0;
        } else {
            try {
                return board_foot_inches / (width * height);
            } catch (Exception e) {
                System.out.println("Must enter a valid number, your input was invalid.");
                return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double WIDTH = scanner.nextDouble();
        System.out.println("Enter height: ");
        double HEIGHT = scanner.nextDouble();

        System.out.println(CalculateBoardFoot(WIDTH, HEIGHT));
        scanner.close();
    }
}