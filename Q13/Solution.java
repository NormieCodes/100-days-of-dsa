/*
Problem: You are given a rectangular matrix of integers. Starting from the outer boundary, traverse the matrix in a clockwise manner and continue moving inward layer by layer until all elements are visited.

Input:
- First line: two integers r and c representing the number of rows and columns
- Next r lines: c integers each representing the matrix elements

Output:
- Print all visited elements in the order of traversal, separated by spaces

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
1 2 3 6 9 8 7 4 5

Explanation:
The traversal begins along the top row, proceeds down the rightmost column, then moves across the bottom row in reverse, and finally goes up the leftmost column. The same pattern repeats for the inner submatrix.

Test Cases:

Test Case 1:
Input:
2 3
1 2 3
4 5 6
Output:
1 2 3 6 5 4

Test Case 2:
Input:
3 1
7
8
9
Output:
7 8 9

*/

import java.util.Scanner;

public class Solution {
  public static void spiralTraversal(int[][] matrix) {
    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
      for (int col = left; col <= right; col++) {
        System.out.print(matrix[top][col] + " ");
      }
      top++;

      for (int row = top; row <= bottom; row++) {
        System.out.print(matrix[row][right] + " ");
      }
      right--;
      
      if (top <= bottom) {
        for (int col = right; col >= left; col--) {
          System.out.print(matrix[bottom][col] + " ");
        }
        bottom--;
      }
      
      if (left <= right) {
        for (int row = bottom; row >= top; row--) {
          System.out.print(matrix[row][left] + " ");
        } 
        left++;
      }
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r,c;
    
    System.out.println("Enter the number of rows: ");
    r = sc.nextInt();

    System.out.println("Enter the number of columns: ");
    c = sc.nextInt();

    int[][] matrix = new int[r][c];

    System.out.println("Enter the elements into the matrix: ");

    for(int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    
    spiralTraversal(matrix);
  }

}