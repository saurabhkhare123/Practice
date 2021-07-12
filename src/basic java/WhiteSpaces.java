import java.util.Scanner;

public  class WhiteSpaces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(remove(sc.nextLine()));
    }
    public static String remove(String m){
        StringBuilder str = new StringBuilder();
        char ch[] = m.toCharArray();
        for(char c : ch){
            if(!Character.isWhitespace(c)){
                str.append(c);
            }
        }
        return str.toString();
    }
}