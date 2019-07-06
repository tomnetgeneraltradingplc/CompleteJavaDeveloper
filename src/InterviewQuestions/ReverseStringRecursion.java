package InterviewQuestions;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String orginal = "Hello";
        System.out.println(reverse(orginal));
    }
    public static String reverse(String str){
        if(str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
