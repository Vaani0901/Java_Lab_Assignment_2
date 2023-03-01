# Java_Lab_Assignment_2

Part 1: Java program to move even and odd numbers to respective arrays
Introduction
This Java program declares two arrays named even and odd. It accepts numbers from the user and moves them to respective arrays depending on whether they are even or odd.

Explanation of the code

1. We import the java.util.Scanner package to accept user input.
2. We declare two arrays named even and odd.
3. We declare two integer variables evenIndex and oddIndex to keep track of the indices of the even and odd arrays respectively.
4. We create a Scanner object named input to accept user input.
5. We print a message asking the user to enter 10 numbers.
6. We use a for loop to accept 10 numbers from the user and check if they are even or odd.
7. If a number is even, we add it to the even array and increment the evenIndex variable. If a number is odd, we add it to the odd array and increment the oddIndex variable.
8. We use another for loop to display the even and odd numbers separately.



Part 2: Java function to find 2 neighboring numbers with the smallest distance

Description: 
The function findNearestNumbers takes an integer array arr as an input parameter and finds the two neighboring numbers with the smallest distance between them. It returns the index of the first number in the pair.

Approach: 
To find the two neighboring numbers with the smallest distance, we need to iterate through the array and compare the absolute difference between each pair of neighboring elements. We keep track of the pair with the smallest difference and return the index of the first number in the pair.




Part 3: Java program to convert an array into ArrayList and vice versa

Description:
The function arrayToArrayList takes an integer array arr as an input parameter and returns an ArrayList containing the same elements as the array. The function arrayListToArray takes an ArrayList of integers arrayList as an input parameter and returns an integer array containing the same elements as the ArrayList.

Approach:
To convert an array to an ArrayList, we can create a new ArrayList and add each element of the array to it using a for loop. To convert an ArrayList to an array, we can create a new array with the same length as the ArrayList and copy each element of the ArrayList into the array using a for loop.
