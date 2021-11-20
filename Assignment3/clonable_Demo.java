package Assignment3;

import java.util.Scanner;

public class clonable_Demo {



    public static void main(String[] args) throws CloneNotSupportedException {
        information obj = new information();
        obj.getName();
        obj.getAge();
        information obj2 ;
        System.out.println("Before obj:");

        obj2 = (information) obj.clone();


        System.out.println("Obj2:"+obj2.display());
        System.out.println("After obj:");

        obj.name = "Sai";
        obj.age = 22;

        System.out.println(obj.display());



        System.out.println("Obj2:");
        System.out.println(obj2.display());

    }
}
