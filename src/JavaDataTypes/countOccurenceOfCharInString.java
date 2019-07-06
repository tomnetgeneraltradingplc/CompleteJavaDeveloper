package JavaDataTypes;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class countOccurenceOfCharInString {
    public static void main(String[] args) {
    CountChar("Hellotomas");
    }
    public static void CountChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] cha = str.toCharArray();
        for (char c:cha){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

}
