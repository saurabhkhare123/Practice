import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element that you want to search");
        int w = sc.nextInt();
        Arrays.sort(arr);
        System.out.print(check(arr,0,7,w));
    }

    public static boolean check(int arr[], int start, int end, int w){

        while(start<end){
            int mid = (start+end)/2;
            if(w == arr[mid]){
                return true;
            }else if(w>arr[mid]){
                return (check(arr,mid+1,end,w));
            }else{
                return (check(arr,start,mid,w));
            }
        }
        return false;

    }
}