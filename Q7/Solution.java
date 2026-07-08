/*
Problem: Write a recursive function fib(n) to compute the n-th Fibonacci number where fib(0)=0 and fib(1)=1.

Input:
- Single integer n

Output:
- Print the n-th Fibonacci number

Example:
Input:
6

Output:
8

Explanation: Sequence: 0,1,1,2,3,5,8 at positions 0,1,2,3,4,5,6
*/

import java.util.Scanner;

public class Solution {
  public static int fibo(int n) {
    int res = 0;

    if (n == 0) return 0;
    if (n == 1) return 1;

    if (n > 1) {
      res = fibo(n-1) + fibo(n-2);
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("compute the n-th Fibonacci number: ");
    int n = sc.nextInt();


    int res = fibo(n);

    System.out.println("Result: " + res);
  }
}
