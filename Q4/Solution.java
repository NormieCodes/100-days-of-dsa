/*
Problem: Given an array of n integers, reverse the array in-place using two-pointer approach.

Input:
- First line: integer n
- Second line: n space-separated integers

Output:
- Print the reversed array, space-separated

Example:
Input:
5
1 2 3 4 5

Output:
5 4 3 2 1

Explanation: Swap pairs from both ends: (1,5), (2,4), middle 3 stays
*/

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements into the array: ");

        for(int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
        }

        for (int elem : arr) {
          System.out.print(elem + " ");
        }
        System.out.println();

        int i = 0; int j = n-1;
        while (i < n/2) {
          arr[i] = arr[i] + arr[j];
          arr[j] = arr[i] - arr[j]; 
          arr[i] = arr[i] - arr[j];
          
          i++; j--;
        }

        for (int elem : arr) {
          System.out.print(elem + " ");
        }
  }
}