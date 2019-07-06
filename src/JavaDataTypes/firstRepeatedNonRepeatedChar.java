package JavaDataTypes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class firstRepeatedNonRepeatedChar {
    public static void main(String[] args) {
        String str = "Ilovecodding,JavaConceptOfTheDay";
        DuplicateNonDuplicateFirstChar(str);
    }
    public static void DuplicateNonDuplicateFirstChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] cha = str.toCharArray();
        for (char c : cha) {
            if(map.containsKey(c)) {
                //If char is present in map, incrementing it's count by 1
                map.put(c, map.get(c)+1);
            }
            else {
                //If char is not present in map, adding this char in map with 1 as it's value
                map.put(c, 1);
            }
        }
        //checking for first repeated character
        for (char c : cha) {
            if (map.get(c) > 1) {
                System.out.println("First Repeated Character In '"+ str + "' is '"+c+"'");
                break;
            }
        }
//checking for first non-repeated character

        for (char c : cha) {
            if (map.get(c) == 1) {
                System.out.println("First Non-Repeated Character In '"+ str +"' is '"+c+"'");
                break;
            }
        }
    }
}
