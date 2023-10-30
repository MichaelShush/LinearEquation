import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, user!");
        System.out.print("Please enter your first point (format: (x, y)): ");
        String pointOne = scanner.nextLine();
        System.out.print("\nPlease enter your second point (same format): ");
        String pointTwo = scanner.nextLine();

        int x1 = Integer.parseInt(pointOne.substring(1, pointOne.indexOf(",")));
        int x2 = Integer.parseInt(pointTwo.substring(1, pointTwo.indexOf(",")));
        int y1 = Integer.parseInt(pointOne.substring(pointOne.indexOf(" ") + 1, pointOne.indexOf(")")));
        int y2 = Integer.parseInt(pointTwo.substring(pointTwo.indexOf(" ") + 1, pointTwo.indexOf(")")));

        LinearEquation line = new LinearEquation(x1, x2, y1, y2);

        line.LineInfo();

        System.out.println();
        System.out.print("Please enter an x-value of your choosing: ");
        double userPoint = scanner.nextDouble();

        System.out.println("The point at your desired value is " + "(" + userPoint + ", " + line.findPoint(userPoint) + ").");
    }
}