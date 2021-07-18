public class Vowels {

    public static void main(String args[]){
        System.out.println(check("Hello"));
    }

    public static boolean check(String str){
        return  str.toLowerCase().matches(".*[aeiou].*");
    }
}