/*
Problem: Read a string and check if it is a palindrome using two-pointer comparison.

Input:
- Single line: string s

Output:
- Print YES if palindrome, otherwise NO

Example:
Input:
level

Output:
YES

Explanation: String reads same forwards and backwards
*/

import java.util.Scanner;

public class Solution {
  public static String checkPalindrome(String s) {
    char[] charArray = s.toCharArray();

    int len = charArray.length;
    int i = 0, j = len - 1;

    while (i < len / 2) {
      if (charArray[i] != charArray[j]) {
        return "NO";
      } 
      i++; j--;
    }
    return "YES";
  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string: ");
  String s = sc.nextLine();
  
  System.out.println(checkPalindrome(s));
  }
}


