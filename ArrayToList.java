import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take array input from the user
        System.out.println("Enter the elements of the array (separated by spaces):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Convert array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(inputArray));
        System.out.println("ArrayList: " + list);

        // Convert ArrayList to array
        String[] outputArray = new String[list.size()];
        list.toArray(outputArray);
        System.out.println("Array: " + Arrays.toString(outputArray));
    }
}
