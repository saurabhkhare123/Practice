public class Fib {
    static int a=0, b=1,c=1;
    public static void fibonacci(int n) {

        if(n>0){
            System.out.print(a);
            a=b;
            b=c;
            c=a+b;

            fibonacci(n-1);
        }

    }

    public static void main(String args[]) {
        int n = 10;
      fibonacci(n);
    }
}