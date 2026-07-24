 /*
Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all non-diagonal elements are 0.

Input:
- First line: integer n representing number of rows and columns
- Next n lines: n integers each representing the matrix elements

Output:
- Print "Identity Matrix" if the matrix satisfies the condition
- Otherwise, print "Not an Identity Matrix"

Example:
Input:
3
1 0 0
0 1 0
0 0 1

Output:
Identity Matrix
*/

import java.util.Scanner;

public class Solution {
  public static boolean checkIdentity(int[][] matrix) {
    int n = matrix.length;
    
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if ((matrix[i][j]) != 1 && (i == j)) {
          return false;
        }
        if ((matrix[i][j]) != 0 && (i != j)) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    
    System.out.println("Enter the dimension of the matrix(mxn): ");
    n = sc.nextInt();

    int[][] matrix = new int[n][n];

    System.out.println("Enter the elements into the matrix: ");

    for(int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    String res = checkIdentity(matrix)? "It is an identity matrix" : "It is not an identity matrix";

    System.out.println(res);
  }
}
