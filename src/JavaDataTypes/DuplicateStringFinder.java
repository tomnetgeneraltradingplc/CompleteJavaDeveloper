package JavaDataTypes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class DuplicateStringFinder {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Banana", "Orrange", "Apple","Banana"};
       DuplicateString(fruit);
        DuplicateStringUsingSet(fruit);
    }
    public static void DuplicateString(String[] str){
        for (int i=0;i<str.length;i++){
            for (int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }
    }
    public static void DuplicateStringUsingSet(String[] str){
        Set<String> set = new HashSet<String>();
            for (String s: str){
                if(set.add(s)==false){
                    System.out.println(s);
                }
        }
    }
}
