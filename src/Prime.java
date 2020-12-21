import java.io.*;
import java.util.Scanner;
class Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i= sc.nextInt();
        primeno(i);

    }
    static void primeno(int i)
    {   int c=0;
        for(int n=2;n< i/2;n++)
        if(i%n==0)
           c++;
        if(c!=0)
        {
            System.out.println("not Prime");
        }else{
            System.out.println(" prime");
        }

    }
}