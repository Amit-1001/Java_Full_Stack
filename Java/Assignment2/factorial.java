package Assignment2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number:");
        n = in.nextInt();
        int fact =1;

        for(int i=1; i<=n;i++){
           fact = fact * i;
        }
        System.out.println("Factorial of number "+n+" is :"+fact);

        System.out.println("Factorial of number "+n+" is :"+(factorial_num(n)));
    }

    private static int factorial_num(int n) {
    int fact = 1;
    if(n==0){
        return  1;
    }
    return n*factorial_num(n-1);
    }
}
