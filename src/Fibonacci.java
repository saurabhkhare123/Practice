import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ,n1=0,n2=1,nextterm;
        i = sc.nextInt();
        for(int n=0;n<i;n++)
        {
            if(n<=1) {
                nextterm = n;
            }
            else{
                nextterm= n1+n2;
                n1=n2;
                n2=nextterm;

            }
            System.out.println(nextterm);

        }


    }
}
