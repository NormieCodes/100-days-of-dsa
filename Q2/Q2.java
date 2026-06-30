/*
Problem: Write a Java program to delete the element at a given 1-based position pos from an array of n integers. Shift remaining elements to the left.

Input:
- First line: integer n
- Second line: n space-separated integers
- Third line: integer pos (1-based position to delete)

Output:
- Print the updated array with (n-1) elements, space-separated

Example:
Input:
5
10 20 30 40 50
2

Output:
10 30 40 50

Explanation: Delete position 2 (element 20), remaining elements shift left
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
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

    System.out.println("Enter the position of element to delete");
    pos = sc.nextInt();
    
    arr.remove(pos-1);

    for (int elem : arr) {
      System.out.print(elem + " ");
    }
    sc.close();
  }
}

