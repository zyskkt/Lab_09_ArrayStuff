import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Declare an array of type int named dataPoints
        int[] dataPoints = new int[100];

        //New random number
        Random rnd = new Random();
        // Iterate through the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // initializes each element to a random value between 1 and 100
        }

        // Second loop  displays the dataPoints values
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        //Blank line for neatness after the array
        System.out.println();

        // Code a loop that calculates the sum and the average of the values in dataPoints
        int sum = 0;
        for (int value : dataPoints) {
            //Add up numbers in array
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        //Use SafeInput again to get a value within a range
        int userVal = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100", 1, 100);
        int count = 0;
        //Iterate over array and count when input matches the number in the array
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userVal) {
                count++;
            }
        }
        //Output
        System.out.println("The value " + userVal + " was found " + count + " times in the array.");

        int matchIndex = SafeInput.getRangedInt(input, "Enter an integer value between 1 and 100", 1, 100);
        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == matchIndex) {
                foundIndex = i;
                break;
            }
        }
        //If the index exists (i.e. isn't -1) print ther results, otherwise not found
        if (foundIndex != -1) {
            System.out.println("The value " + matchIndex + " was found at array index " + foundIndex);
        } else {
            System.out.println("The value " + matchIndex + " was not found in the array.");
        }

        //Initialize variables for minimum and maximum values in array
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];
        //Iterate through array
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + minValue);
        System.out.println("The maximum value in the array is: " + maxValue);

        double[] myArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        double arrayAverage = calculateAverage(myArray);
        System.out.println("The average of myArray is: " + arrayAverage);
    }
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }
}
