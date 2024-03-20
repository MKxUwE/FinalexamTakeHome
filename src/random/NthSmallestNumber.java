package random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int[] randomNumbers = generateRandomNumbers(500);

  System.out.print("Enter the value of n (1 to 500): ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 500) {
            int nthSmallest = findNthSmallest(randomNumbers, n);
            System.out.println("The " + n + "th smallest number is: " + nthSmallest);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 500.");
        }
        scanner.close();
    }
    public static int[] generateRandomNumbers(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(1000); 
        }
        return randomNumbers;
    }

    public static int findNthSmallest(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1]; 
    }
}