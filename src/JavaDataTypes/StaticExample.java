package JavaDataTypes;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
class Employee{
    static String str1="";
    String str2="";
    public static void strDisplay1(){
        str1="hello";
        //str2="str2";
    }
    public void strDisplay2(){
        str1="hello";
        str2="str2";
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.strDisplay2();
        Employee.strDisplay1();
    }


}
