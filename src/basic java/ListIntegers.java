import java.util.LinkedList;
import java.util.Scanner;

public class ListIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i< 5 ; i++){
            list.add(sc.nextInt()%2);
        }
        if(list.contains(0)){
            System.out.print("all numbers are not odd");
        }else{
            System.out.println("all are odd");
        }
    }
}