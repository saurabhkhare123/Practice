import java.io.*;

public class Reverse {

    public static void main(String[] args){
        String str="life";
        System.out.println(reverse(str));

    }

    public static String reverse(String str){
        if(str==null){
            throw new IllegalArgumentException("Null is not a valid input");
        }
        StringBuilder out = new StringBuilder();
        char ch[] = str.toCharArray();
        for(int i= ch.length-1;i>=0;i--){
            out.append(ch[i]);
        }
        return out.toString();
    }

}