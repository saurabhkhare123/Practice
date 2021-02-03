package Array;

import java.util.Arrays;

public class Largest_Sum {

    public static void main(String[] args) {
        int max_so_far ,min_end_here;
        max_so_far=0;min_end_here=0;
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        for ( int i =0; i<a.length; i++)
        {  min_end_here = min_end_here + a[i];
            if(min_end_here< a[i])
            {
                min_end_here = a[i];

            }
            if(max_so_far < min_end_here){
                max_so_far = min_end_here;
            }
        }
        System.out.println(max_so_far);

    }
}
