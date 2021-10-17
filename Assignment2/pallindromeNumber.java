

import java.util.Scanner;

public class pallindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        int copy=n;
        int pallindrome=0;

        while (n!=0){
            int rem = n%10;

            pallindrome = pallindrome*10 + rem;

            n = n/10;
        }
        if(pallindrome == copy){
            System.out.println("Number is pallindrome");
        }
        else {
            System.out.println("Number is not pallindrome");
        }

    }

    }

