package Assignment2;

import java.util.Scanner;

public class checkSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two number");
        a = in.nextInt();
        b = in.nextInt();

        if((a>=0 && b<0) || (a<0 && b>=0)){
            System.out.println("Two integers are of opposite signs");
        }else{
            System.out.println("Two integers are not opposite sign");
        }
    }
}
