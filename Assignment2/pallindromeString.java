

import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = in.next();

        int start =0, end= str.length()-1;

        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("String is not pallindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("String is pallindrome");

    }
}
