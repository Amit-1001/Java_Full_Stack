package Assignment2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        Calculator obj = new Calculator();
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        System.out.println("Enter choice:");
        int ch = in.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
                obj.add(a,b);
                break;
            case 2:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
                obj.sub(a,b);
                break;
            case 3:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
                obj.mul(a,b);
                break;
            case 4:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
                obj.div(a,b);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
     public void add(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }

     public void sub(int a, int b) {
        System.out.println("Subtraction:"+(a-b));
    }

     public void mul(int a, int b) {
        System.out.println("Multiplication:"+(a*b));
    }

     public void div(int a, int b) {
        System.out.println("Division:"+(a/b));
    }
}
