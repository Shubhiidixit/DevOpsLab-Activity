import java.util.Scanner;
import java.util.Arrays;

public class UserInputSort {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of elements
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        // Create an array to hold the input elements
        int[] arr = new int[n];
        
        // Read the elements from the user
        System.out.println("Enter " + n + " integers:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


