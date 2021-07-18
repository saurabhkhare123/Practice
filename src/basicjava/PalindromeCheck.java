import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       boolean m= check(sc.next());
       if(m){
           System.out.println("palindrome");

       }else{
           System.out.print("no");
       }
    }
    public static boolean check(String m){
        StringBuilder str = new StringBuilder();
        str.append(m);
        return m.equals(str.reverse().toString());

    }
}