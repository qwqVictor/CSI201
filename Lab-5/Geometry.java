import java.util.Scanner;

/**
 * This program demonstrates static methods
 */
public class Geometry {
    /**
     * Print the main menu
     * Calling this to get a menu printed to stdout
     */
    static void printMenu() {
        System.out.print("This is a geometry calculator \n" +
        "Choose what you would like to calculate \n" +
        "1. Find the area of a circle \n" +
        "2. Find the area of a rectangle \n" +
        "3. Find the area of a triangle \n" +
        "4. Find the circumference of a circle \n" +
        "5. Find the perimeter of a rectangle \n" +
        "6. Find the perimeter of a triangle \n" +
        "Enter the number of your choice: ");
    }

    /**
     * Calculate area of circle
     * @param r radius of circle
     * @return area
     */
    static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Calculate area of rectangle
     * @param l length
     * @param w width
     * @return area
     */
    static double rectangleArea(double l, double w) {
        return l * w;
    }

    /**
     * Calculate area of triangle
     * @param b base
     * @param h height
     * @return area
     */
    static double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    /**
     * Calculate circumference of circle
     * @param r radius of circle
     * @return circumference
     */
    static double circleCircumference(double r) {
        return 2 * Math.PI * r;
    }

    /**
     * Calculate perimeter of rectangle
     * @param l length
     * @param w width
     * @return perimeter
     */
    static double rectanglePerimeter(double l, double w) {
        return 2 * (l + w);
    }
    
    /**
     * Calculate perimeter of triangle
     * @param a side A
     * @param b side B
     * @param c side C
     * @return perimeter
     */
    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int choice; // the user's choice
        double value = 0; // the value returned from the method
        char letter; // the Y or N from the user's decision to exit
        double radius; // the radius of the circle
        double length; // the length of the rectangle
        double width; // the width of the rectangle
        double height; // the height of the triangle
        double base; // the base of the triangle
        double side1; // the first side of the triangle
        double side2; // the second side of the triangle
        double side3; // the third side of the triangle

        // create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // do loop was chose to allow the menu to be displayed first
        do {
            // call the printMenu method
            printMenu();
            choice = keyboard.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius = keyboard.nextDouble();
                // call the circleArea method and store the result in the value
                value = circleArea(radius);
                System.out.println("The area of the circle is " + value);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                width = keyboard.nextDouble();
                // call the rectangleArea method and store the result in the value
                value = rectangleArea(length, width);
                System.out.println("The area of the rectangle is " + value);
                break;
            case 3:
                System.out.print("Enter the height of the triangle: ");
                height = keyboard.nextDouble();
                System.out.print("Enter the base of the triangle: ");
                base = keyboard.nextDouble();
                // call the triangleArea method and store the result in the value
                value = triangleArea(base, height);
                System.out.println("The area of the triangle is " + value);
                break;
            case 4:
                System.out.print("Enter the radius of the circle: ");
                radius = keyboard.nextDouble();
                // call the circumference method and store the result in the value
                value = circleCircumference(radius);
                System.out.println("The circumference of the circle is " + value);
                break;
            case 5:
                System.out.print("Enter the length of the rectangle: ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                width = keyboard.nextDouble();
                // call the perimeter method and store the result in the value
                value = rectanglePerimeter(length, width);
                System.out.println("The perimeter of the rectangle is " + value);
                break;
            case 6:
                System.out.print("Enter the length of side 1 of the triangle: ");
                side1 = keyboard.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle: ");
                side2 = keyboard.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle: ");
                side3 = keyboard.nextDouble();
                // call the perimeter method and store the result in the value
                value = trianglePerimeter(side1, side2, side3);
                System.out.println("The perimeter of the triangle is " + value);
                break;
            default:
                System.out.println("You did not enter a valid choice.");
            }

            // consumes the new line character after the number
            keyboard.nextLine();
            System.out.println("Do you want to exit the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        } while (letter != 'Y' && letter != 'y');
    }
}