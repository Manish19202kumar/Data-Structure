package Classpgms;

import java.util.Scanner;

public class Knapsack_Problem {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of items: ");
	        int n = scanner.nextInt();

	        int[] weights = new int[n];
	        int[] values = new int[n];

	        System.out.println("Enter the weights of items:");
	        for (int i = 0; i < n; i++) {
	            weights[i] = scanner.nextInt();
	        }

	        System.out.println("Enter the values of items:");
	        for (int i = 0; i < n; i++) {
	            values[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the capacity of the knapsack: ");
	        int capacity = scanner.nextInt();

	        int result = knapsack(weights, values, capacity, n);
	        System.out.println("Maximum value in Knapsack: " + result);

	        scanner.close();
	    }

	    static int knapsack(int[] weights, int[] values, int capacity, int n) {
	        int[][] dp = new int[n + 1][capacity + 1];

	        for (int i = 0; i <= n; i++) {
	            for (int w = 0; w <= capacity; w++) {
	                if (i == 0 || w == 0) {
	                    dp[i][w] = 0;
	                } else if (weights[i - 1] <= w) {
	                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
	                } else {
	                    dp[i][w] = dp[i - 1][w];
	                }
	            }
	        }

	        return dp[n][capacity];
	    }
}
