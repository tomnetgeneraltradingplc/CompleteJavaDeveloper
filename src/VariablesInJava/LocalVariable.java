package VariablesInJava;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class LocalVariable {
    // instance variable
    public String myVar="instance variable";

    public void myMethod(){
        // local variable
        String myVar = "Inside Method/Local Variable";
        System.out.println(myVar);
    }
    public static void main(String[] args) {
        // Creating object
        LocalVariable obj = new LocalVariable();
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}
