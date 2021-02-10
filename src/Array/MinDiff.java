package Array;

//Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer.
//Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
//
//
//Example 1:
//
//Input:
//K = 2, N = 4
//Arr[] = {1, 5, 8, 10}
//Output:
//5
//Explanation:
//The array can be modified as
//{3, 3, 6, 8}. The difference between
//the largest and the smallest is 8-3 = 5.
//Example 2:
//
//Input:
//K = 3, N = 5
//Arr[] = {3, 9, 12, 16, 20}
//Output:
//11
//Explanation:
//The array can be modified as
//{6, 12, 9, 13, 17}. The difference between
//the largest and the smallest is 17-6 = 11.
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n and k as input parameters and returns an integer denoting the minimum difference.
//
//
//Expected Time Complexity: O(N*logN)
//Expected Auxiliary Space: O(N)
//
//Constraints
//1 ≤ K ≤ 104
//1 ≤ N ≤ 105
//1 ≤ Arr[i] ≤ 105

import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class MinDiff
{
    // static int arr[] = new int[]{1, 15, 10} ;

    // Modifies the array by subtracting/adding
    // k to every element such that the difference
    // between maximum and minimum is minimized
    static int getMinDiff( int n, int k,int[] arr)
    {
        // There should be at least two elements
        if (n <= 1)
            return 0;

        // Sort array in increasing order
        Arrays.sort(arr);

        // Initialize maximum and minimum
        int maxe = arr[n-1];
        int mine = arr[0];

        // If k is more than difference between maximum
        // and minimum, add/subtract k to all elements
        // as k cannot decrease the difference
        if (k >= maxe - mine)
        {
            for (int i=0; i<n; i++)
                arr[i] += k; // Subtract would also work
            return (maxe - mine);
        }

        // In sorted array, first element is minimum
        // and last is maximum, we must add k to minium
        // and subtract k from maximum
        arr[0]   += k;
        arr[n-1] -= k;

        // Initialize mac and min of modified array (only
        // two elements have been finalized)
        int new_max = Math.max(arr[0], arr[n-1]);
        int new_min = Math.min(arr[0], arr[n-1]);

        // Finalize middle n-2 elements
        for (int j=1; j<n-1; j++)
        {
            // If current element is less than min of
            // modified array, add k.
            if (arr[j] < new_min)
                arr[j] += k;

                // If current element is more than max of
                // modified array, subtract k.
            else if (arr[j] > new_max)
                arr[j] -= k;

                // arr[j] is between new_min and new_max

                // If arr[j] is closer to new_max, subtract k
            else if ((arr[j] - new_min) > (new_max - arr[j]))
                arr[j] -= k;

                // Else add k
            else
                arr[j] += k;

            // Update new_max and new_min if required
            new_max = Math.max(arr[j], new_max);
            new_min = Math.min(arr[j], new_min);
        }

        // Returns difference between new_max and new_min
        return (new_max - new_min);
    }

    public static void main (String[] args) {
        //code
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        MinDiff g=new MinDiff();
        for(int q=0;q<t;q++){
            int k=scan.nextInt();
            int n=scan.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=scan.nextInt();

            System.out.println(g.getMinDiff(n,k,a));
        }
    }
}