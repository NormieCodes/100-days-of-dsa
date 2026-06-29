/*
Problem: Write a Java program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.

Input:
- First line: integer n
- Second line: n space-separated integers (the array)
- Third line: integer pos (1-based position)
- Fourth line: integer x (element to insert)

Output:
- Print the updated array (n+1 integers) in a single line, space-separated

Example:
Input:
5
1 2 4 5 6
3
3

Output:
1 2 3 4 5 6

Explanation: Insert 3 at position 3, elements [4,5,6] shift right
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, pos;
    ArrayList<Integer> arr = new ArrayList<>();

    System.out.println("Enter the size of the array: ");
    n = sc.nextInt();

    System.out.println("Insert into array");

    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();
      arr.add(temp);
    }

    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    System.out.println();

    System.out.println("Enter the position of new element");
    pos = sc.nextInt();
    System.out.println("Enter the element to insert at position " + pos);
    int newElement = sc.nextInt();

    arr.add(pos-1, newElement);

    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    sc.close();
  }
}
