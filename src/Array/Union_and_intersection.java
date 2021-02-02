package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Union_and_intersection {

    static void uandI(int  m[],int n[])
    { int intersection[] = new int[n.length-1];
      int t=0;
        if(m.length > n.length)
        {
            for(int i = 0; i< n.length; i++)
            {
                for(int j=0; j< m.length; j++)
                {
                    if( n[i] == m[j])
                    {
                        intersection[t]= n[i];
                                t++;
                    }
                }
            }
        }else{

            for(int i = 0; i< m.length; i++)
            {
                for(int j=0; j< n.length; j++)
                {
                    if( m[i] == n[j])
                    {
                        intersection[t]= m[i];
                        t++;
                    }
                }
            }


        }
        System.out.println(Arrays.toString(intersection));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m[] = {1,2,3,4,5};
        int n[] = {1,2,3,6};

        uandI( m,  n);

    }


}
