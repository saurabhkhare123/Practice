public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(check(12,2));
    }
    static boolean check(int m, int i){

        if(m<=2){
            return m==2? true:false;

        }
        if(m%i==0)
            return false;
        if(i*i>m)
            return true;
        return check(m, i+1);
    }
}