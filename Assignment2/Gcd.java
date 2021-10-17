package Assignment2;

import java.util.Scanner;

public class Gcd {
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two number");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
