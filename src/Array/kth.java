package Array;

import java.util.Arrays;
import java.util.Scanner;

public class kth {

    static void Kth_element(int a[], int l,int k){

        for(int i =0; i<l;i++)
        {int temp;
            for(int j=0; j<=i;j++)
            {
            if(a[i]<a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }}


        }
        System.out.println(a[k]);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n; i++)
        {
            a[i]= sc.nextInt();
        }

        Kth_element(a,n,k);
    }







}
