

import java.util.Scanner;

public class greatestAmonThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Three number");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();


        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>c && b> c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
}
