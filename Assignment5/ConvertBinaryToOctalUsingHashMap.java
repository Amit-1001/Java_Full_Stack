package Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertBinaryToOctalUsingHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> number = new HashMap<>();

        //
        number.put(0,0);
        number.put(1,1);
        number.put(2,10);
        number.put(3,11);
        number.put(4,100);
        number.put(5,101);
        number.put(6,110);
        number.put(7,111);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = in.nextInt();

        System.out.println("Binary of given number is:"+number.get(n));




    }
}
