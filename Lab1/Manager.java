//Logan Nestlebush
//CS145
//1/20/2025
//Lab 1 


import java.util.Scanner;

public class Manager {
    
    // Nested Location class inside Manager class
    public static class Location {
        public int row;
        public int column;
        public double maxValue;

        // Constructor to initialize the Location object
        public Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }
    }

    // Builds the 2D array by accepting input from the user
    public double[][] buildArray(int rows, int columns) {
        ArrayInitializer initializer = new ArrayInitializer();  // Create an ArrayInitializer object
        double[][] array = initializer.initializeArray(rows, columns); // Initialize the array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");

        // Fills the array with user inputs
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }

    // Locates the largest element in the array and its position
    public Location locateLargest(double[][] array) {
        int row = 0;
        int column = 0;
        double maxValue = array[0][0];

        // Loop through the 2D array to find the largest element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        // Returns location and value of largest value
        return new Location(row, column, maxValue);
    }
}
