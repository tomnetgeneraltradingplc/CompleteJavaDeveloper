package HelloWorld;

/**
 * Created by Palindrome Tibebu,
 * Date May 20, 2019
 **/
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isWordPalindrome("ReverseArrayWithoutStringMethod"));
        System.out.println(isWordPalindrome("wow"));

    }
    public static boolean isWordPalindrome(String str){
        String reverseString="";
        for (int i=str.length()-1;i>=0;i--){

            reverseString = reverseString + str.charAt(i);
        }
        //out put false
        if (str.equals(reverseString)){
            return true;
        }
        else return false;
    }



}
