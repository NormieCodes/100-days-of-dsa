/*
Problem: A system receives two separate logs of user arrival times from two different servers. Each log is already sorted in ascending order. Your task is to create a single chronological log that preserves the correct order of arrivals.

Input:
- First line: integer p (number of entries in server log 1)
- Second line: p sorted integers representing arrival times from server 1
- Third line: integer q (number of entries in server log 2)
- Fourth line: q sorted integers representing arrival times from server 2)

Output:
- Print a single line containing all arrival times in chronological order, separated by spaces

Example:
Input:
5
10 20 30 50 70
4
15 25 40 60

Output:
10 15 20 25 30 40 50 60 70

Explanation: Compare the next unprocessed arrival time from both logs and append the earlier one to the final log until all entries are processed
*/

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p,q;
    
    System.out.println("Enter the size of the 1st log: ");
    p = sc.nextInt();

    int log1[] = new int[p];

    System.out.println("Enter the elements in log 1: ");
    for (int i = 0; i < p; i++) {
      log1[i] = sc.nextInt();
    }

    System.out.println("Enter the size of the 2nd log: ");
    q = sc.nextInt();

    int log2[] = new int[q];

    System.out.println("Enter the elements in log 2: ");
    for (int i = 0; i < q; i++) {
      log2[i] = sc.nextInt();
    }

    for (int elem: log1) {
      System.out.print(elem + " ");
    }

    System.out.println();

    for (int elem: log2) {
      System.out.print(elem + " ");
    }

    System.out.println();

    int log[] = new int[p+q];

    int i =  0; int j = 0; int k = 0;

    while (i < p && j < q) {
      if (log1[i] < log2[j]) {
        log[k] = log1[i];
        i++; k++;
      }
      else {
        log[k] = log2[j];
        j++; k++;
      }
    }

    while (i < p) {
      log[k] = log1[i];
      i++; k++;
    }

    while (j < q) {
      log[k] = log2[j];
      j++; k++;
    }


    for (int elem : log) {
      System.out.print(elem + " ");
    }
    System.out.println();
  }
}