package Array;

// program to reverse the array
import java.util.Scanner;

public class Reverse {

    static void reverse(int a[], int l) {
        for (int i = l - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Reverse s = new Reverse();
        s.reverse(a, n);
    }
}



