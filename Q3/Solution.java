/*Problem: Implement linear search to find key k in an array. Count and display the number of comparisons performed.

Input:
- First line: integer n (array size)
- Second line: n space-separated integers
- Third line: integer k (key to search)

Output:
- Line 1: "Found at index i" OR "Not Found"
Line 2: "Comparisons = c"

Example:
Input:
5
10 20 30 40 50
30

Output:
Found at index 2
Comparisons = 3

Explanation: Compared with 10, 20, 30 (found at index 2 with 3 comparisons)*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cmp = 0; int key;

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

        System.out.println("Enter the element to search: ");
        key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == key) {
            System.out.println("Key is found at index " + i);
            System.out.println("Total comparisons: " + ++cmp);
            break;
          }
          cmp++;
          if (arr[i] != key && i == n-1) {
            System.out.println("Not Found");
          }
        }
        sc.close();
    }
}
