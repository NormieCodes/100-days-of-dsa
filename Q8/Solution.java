/*
Problem: Given integers a and b, compute a^b using recursion without using pow() function.

Input:
- Two space-separated integers a and b

Output:
- Print a raised to power b

Example:
Input:
2 5

Output:
32

Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32
*/

import java.util.Scanner;

public class Solution {

  public static int power(int a, int b) {
    int res = 0;

    if (b == 0) return 1;
    if (b == 1) return a;

    if (b > 1) {
      res = a * power(a,b-1);
    }
    return res;
  }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int a, b;

   System.out.println("Enter the value of a: ");
   a = sc.nextInt();

   System.out.println("Enter the value of b: ");
   b = sc.nextInt();

   int res = power(a, b);
   System.out.println("Power: " + res);
  }
}
