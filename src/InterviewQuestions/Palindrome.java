package InterviewQuestions;

/**
 * Created by Palindrome Tibebu,
 * Date May 20, 2019
 **/
public class Palindrome {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "wow";
        System.out.println(isWordPalindrome(str));
        System.out.println(isWordPalindrome(str2));
    }

    public static boolean isWordPalindrome(String str){
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);
        }
        //out put false
        if (str.equals(reversed)){
            return true;
        }
        else return false;
    }
}
