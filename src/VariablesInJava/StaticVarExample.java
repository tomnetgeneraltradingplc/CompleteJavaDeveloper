package VariablesInJava;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class StaticVarExample {
    //Static (or class) Variable
    public static String myClassVar="class or static variable";
    public static void main(String[] args) {
        StaticVarExample obj1 = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();
        //All three will display "class or static variable"
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //changing the value of static/class variable using obj2
        obj2.myClassVar = "Changed Text";

        //All three will display "Changed Text"
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        //we can access the static variables without using the objects
        System.out.println("===========================================");
        myClassVar = "Changed Text again";
        System.out.println(myClassVar);
    }
}
