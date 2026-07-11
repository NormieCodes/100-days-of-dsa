/* 
Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.

Input:
- Single line: a lowercase string containing only alphabetic characters (no spaces)

Output:
- Print the transformed code name after applying the mirror operation

Example:
Input:
hello

Output:
olleh

Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored
*/

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a single line string: ");
    String str = sc.nextLine().toLowerCase();
    char[] charArray = str.toCharArray();

    int i = 0, j = charArray.length - 1;
    while (i < charArray.length/2) {
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;
      i++; j--;
    }

    str = new String(charArray);
    System.out.println(str);
  }
}