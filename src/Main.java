import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Declare an array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate the sum of the values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        // Calculate the average
        double average = (double) sum / dataPoints.length;

        // Display the sum and average with descriptions
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}


class Main2 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Prompt the user for an int value between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 100: ", 1, 100);

        // Code a loop to count how many times the user's value is found in the dataPoints array
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The value " + userValue + " was found " + count + " times in the array.");
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        scanner.close();
    }
}


class Main3 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Prompt the user for an int value between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int userValue;
        boolean found = false;

        do {
            userValue = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 100: ", 1, 100);

            // Code a loop to check if the user's value is found in the dataPoints array
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userValue) {
                    found = true;
                    System.out.println("The value " + userValue + " was found at array index " + i);
                    break; // Short-circuit the loop when the value is found
                }
            }

            if (!found) {
                System.out.println("The value " + userValue + " was not found in the array.");
            }

        } while (!found);

        scanner.close();
    }
}


class Main4 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int min = dataPoints[0]; // Assume the first element is the initial minimum
        int max = dataPoints[0]; // Assume the first element is the initial maximum

        // Loop to find the minimum and maximum values
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i]; // Update the minimum value
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i]; // Update the maximum value
            }
        }

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}


class Main5 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate and display the average
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}


class MainExtraCredit {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize each element in the dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate and display the minimum and maximum values
        System.out.println("Minimum value in the array: " + min(dataPoints));
        System.out.println("Maximum value in the array: " + max(dataPoints));

        // Count and display the occurrences of a specific value (e.g., 42)
        int targetValue = 42;
        System.out.println("The value " + targetValue + " occurs " + occuranceScan(dataPoints, targetValue) + " times in the array.");

        // Calculate and display the sum of the values in the array
        System.out.println("Sum of the values in the array: " + sum(dataPoints));

        // Check if the array contains a specific value (e.g., 50)
        int checkValue = 50;
        System.out.println("Array contains " + checkValue + ": " + contains(dataPoints, checkValue));
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int occuranceScan(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
