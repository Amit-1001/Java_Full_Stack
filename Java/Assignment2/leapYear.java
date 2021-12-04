package Assignment2;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter Year:");
        a = in.nextInt();

        if(a%400==0){
            System.out.println("Given Year is leap year");
        }
        else if(a%100==0){
            System.out.println("Given Year is not leap year");

        }
        else if (a%4==0){
            System.out.println("Given Year is leap year");
        }
        else{
            System.out.println("Given Year is not leap year");
        }
    }
}
