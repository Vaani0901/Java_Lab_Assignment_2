import java.util.Scanner;

public class EvenOddArray {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int[] even = new int[10]; // maximum size of the array is 10
      int[] odd = new int[10];
      int evenCount = 0, oddCount = 0; // initialize count variables to 0
      
      System.out.println("Enter 10 integers:");
      for(int i = 0; i < 10; i++) {
         int num = input.nextInt();
         
         if(num % 2 == 0) { // check if the number is even
            even[evenCount] = num;
            evenCount++;
         }
         else { // if the number is odd
            odd[oddCount] = num;
            oddCount++;
         }
      }
      
      System.out.println("\nEven numbers are:");
      for(int i = 0; i < evenCount; i++) {
         System.out.print(even[i] + " ");
      }
      
      System.out.println("\nOdd numbers are:");
      for(int i = 0; i < oddCount; i++) {
         System.out.print(odd[i] + " ");
      }
      
      input.close();
   }
}
