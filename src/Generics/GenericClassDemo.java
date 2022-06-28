package Generics;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;

public class GenericClassDemo <T>{
    private T t;
    private  String name;


    public void setValue(T t){
        this.t = t;
    }

    public T getValue(){
        return t;
    }

//    public void setName(String name){
//        this.name = name;
//
//    }
//
//    public String getName(){
//        return name;
//    }
//

    public static void main(String[] args) {
        GenericClassDemo<Integer> iobj = new GenericClassDemo<Integer>();
        iobj.setValue(10);
        System.out.println("Integer Object: " + iobj.getValue());

        GenericClassDemo<String> sobj = new GenericClassDemo<String>();
        sobj.setValue("Dare");
        System.out.println("String Object: " + sobj.getValue());
    }
}
