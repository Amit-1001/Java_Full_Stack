package Assignment4;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LCM obj = new LCM();

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();


        if(a<0 || b<0 || c<0) {
            throw new Exception("Negative Number!!");
        } else {
            int lcm3Num = obj.findLCM(obj.findLCM(a, b), c);
            System.out.println("LCM of " + a + ", " + b + " and " + c + " is " + lcm3Num);
        }
    }

    public int findLCM(int num1, int num2) {
        return (num1 * num2)/findGCD(num1, num2);
    }

    public int findGCD(int num1, int num2) {
        int gcd;
        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num2;
        return gcd;
    }



}
