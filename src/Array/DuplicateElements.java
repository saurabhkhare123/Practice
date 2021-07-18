package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){
        String[] str = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        check(str);
    }

    private static void check(String str[]){
        Set<Object> check = new HashSet<>();
        for( String i: str){
           if( !check.add(i))
               System.out.println(i);
        }
    }

}
