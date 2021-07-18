package Array;

public class Second {
    public static void main(String args[]){
        int arr[] = {2,3,34,9,1,4};
        int largest= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>second){
                second = arr[i];
            }
        }
        if(second==Integer.MIN_VALUE && second!= largest){
            System.out.print("no second");
        }else{
            System.out.print(second);
        }
    }
}
