import java.util.Scanner;

public class NeighboringNumbers {
    
    public static int findSmallestDistanceIndex(int[] arr) {
        int minIndex = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i-1]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i-1;
            }
        }
        
        return minIndex;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int index = findSmallestDistanceIndex(arr);
        System.out.println("Index of neighboring numbers with smallest distance: " + index);
    }
}
