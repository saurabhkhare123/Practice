import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {
    public static void main(String args[]){
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(sameElements(a1,a2));
        System.out.println(sameElements(a1,a3));
    }

    public static boolean sameElements( Object[] a1, Object[] a2){
        Set<Object> unique1 = new HashSet<>(Arrays.asList(a1));
        Set<Object> unique2 = new HashSet<>(Arrays.asList(a2));
        if(unique1.size()!=unique2.size()){
            return false;
        }
        for(Object obj:unique1){
            if(!unique2.contains(obj)){
                return false;
            }
        }
        return true;
    }
}