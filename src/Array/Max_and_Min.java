package Array;

import java.util.Scanner;

public class Max_and_Min {

    static int maximum(int a[], int l){
        int max = a[0];
        for(int i =0; i< l-1;i++)
        {
            if( max > a[i+1] ){
                max = a[i+1];
            }

        }
         return max ;
     }
     int minimum(int a[], int l){
         int min = a[0];
         for(int i =0; i< l-1;i++)
         {
             if( min < a[i+1] ){
                 min = a[i+1];
             }

         }
         return min ;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for ( int i = 0; i<n; i++)
        {
            a[i]= sc.nextInt();
        }
        Max_and_Min m = new Max_and_Min();
      int max=  m.minimum(a,n);
      int min=  maximum(a,n);
        System.out.println(" Maximum element is " + max + " and minimum element is " + min);
    }
}
