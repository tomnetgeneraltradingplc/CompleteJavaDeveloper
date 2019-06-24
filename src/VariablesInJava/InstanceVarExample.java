package VariablesInJava;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class InstanceVarExample {
    String myInstanceVar="instance variable";
    public static void main(String[] args) {
        InstanceVarExample obj1 = new InstanceVarExample();
        InstanceVarExample obj2 = new InstanceVarExample();
        InstanceVarExample obj3 = new InstanceVarExample();

        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
        obj2.myInstanceVar = "Changed Text";
        System.out.println("=========================");
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
}
