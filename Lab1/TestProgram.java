//Logan Nestlebush
//CS145
//1/20/2025
//Lab 1 


import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create an instance of the Manager class to build the array and find the largest value
        Manager manager = new Manager();

        // Build the array
        double[][] array = manager.buildArray(rows, columns);

        // Locate the largest value in the array
        Manager.Location largestLocation = manager.locateLargest(array);

        // Display the result
        System.out.println("The largest element is " + largestLocation.maxValue + 
                           " at location (" + largestLocation.row + ", " + largestLocation.column + ")");
    }
}
