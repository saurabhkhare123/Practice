import java.util.Scanner;
class fibonacci2{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, ans;
        i = sc.nextInt();
      fibonacci2 m=new fibonacci2();
      m.Fibonacci(i);



    }


        
    int n1=0,n2=1,n=0,next = 0;
    void Fibonacci(int i)
    {

        if(i>0) {
            if(n<=1)
            next = n;

        else{
            next= n1+n2;
            n1=n2;
            n2=next;

        }
        System.out.println(next);
        n++;
        Fibonacci(--i);


    }}}