package com.arr2d;

import java.util.Scanner;

public class Lab9 {
	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        // Number of rows
        int n = s.nextInt();

        // Initialize a 2D array
        int[][] arr = new int[n][];
        int t = 0;

        // Input for each row
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            // Assuming all rows have the same column count
            t = m;
            arr[i] = new int[m];

            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        int odd = 0, even = 0;

        System.out.println("Rows " + n + " with " + t
                           + " Columns");
        System.out.println("Elements of Array:");

        // Print the entire array and count even/odd numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                // Count even and odd numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            System.out.println();
        }

        // Print the aggregated results
        System.out.println("Even: " + even
                           + ", Odd: " + odd);

        s.close();
    }
}