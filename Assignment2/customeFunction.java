package Assignment2;

import java.util.Scanner;

public class customeFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        customeFunction obj = new customeFunction();
        System.out.println("1.Sum of two numbers 2.Sum of three numbers 3.Multiplication of two numbers 4.Multiplication of three numbers");
        System.out.println("Enter choice:");
        int ch = in.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
              obj.addTwo(a,b);
                break;
            case 2:
                System.out.println("Enter Three number");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                obj.addThree(a,b,c);
                break;
            case 3:
                System.out.println("Enter two number");
                a = in.nextInt();
                b = in.nextInt();
                obj.multTwo(a,b);
                break;
            case 4:
                System.out.println("Enter Three number");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
               obj.mulThree(a,b,c);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
    public void addTwo(int a, int b) {
        System.out.println("Sum of two numbers:"+(a+b));
    }

    public void addThree(int a, int b , int c) {
        System.out.println("Sum of three numbers:"+(a+b+c));
    }

    public void multTwo(int a, int b) {
        System.out.println("Multiplication of two numbers:"+(a*b));
    }

    public void mulThree(int a, int b, int c) {
        System.out.println("Multiplication of three numbers:"+(a*b*c));
    }
}
