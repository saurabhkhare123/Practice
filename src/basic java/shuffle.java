import java.util.Arrays;
import java.util.Random;

class shuffle{
    public static void main(String args[]){
        int arr[] = {1,5,7,6,4};
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            int randm = rand.nextInt(arr.length);
            int temp = arr[randm];
            arr[randm]= arr[i];
            arr[i] = temp;

        }
        System.out.print(Arrays.toString(arr));
    }
}