/*
 * Task 5: Arrays & Basic Data Analysis Program
 * Java Developer Internship
 *
 * This program demonstrates:
 * - Single-dimensional arrays
 * - Multi-dimensional arrays
 * - Sum, Average, Min, Max calculations
 * - Manual sorting (Bubble Sort)
 * - Exception handling
 */

public class Task5 {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Single-Dimensional Array
        // -------------------------------
        int[] numbers = {45, 12, 78, 34, 89, 23};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Loop to calculate sum, max, min
        for (int num : numbers) {
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / numbers.length;

        // -------------------------------
        // 2. Manual Sorting (Bubble Sort)
        // -------------------------------
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];      
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // -------------------------------
        // 3. Display Results
        // -------------------------------
        System.out.println("===== Array Data Analysis =====");
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // -------------------------------
        // 4. Multi-Dimensional Array
        // -------------------------------
        int[][] marks = {
                {85, 90, 78},
                {88, 76, 92}
        };

        System.out.println("\n===== Multi-Dimensional Array =====");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------------------
        // 5. Exception Handling Demo
        // -------------------------------
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(numbers[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        }

        System.out.println("\nProgram executed successfully.");
    }
}
