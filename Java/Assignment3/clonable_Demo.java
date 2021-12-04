package Assignment3;

import java.util.Scanner;

public class clonable_Demo {



    public static void main(String[] args) throws CloneNotSupportedException {
        information obj = new information();
        obj.getName();
        obj.getAge();
        information obj2 ;
        System.out.println("Before obj:");

        obj2 = (information) obj.clone(); // cloning obj in obj2


        System.out.println("Obj2:"+obj2.display()); // first content of obj2
        System.out.println("After obj:");

        obj.name = "Sai"; // changed obj content
        obj.age = 22;

        System.out.println(obj.display()); // new obj content



        System.out.println("Obj2:");
        System.out.println(obj2.display()); // this will show old content of obj due to clonable

    }
}
