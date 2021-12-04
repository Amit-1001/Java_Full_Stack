package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.rotate;

public class rotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("Enter element for list:");
        for(int i=0;i<size;i++){
            list.add(in.nextInt());
        }

        System.out.println("Enter K value:");
        int k = in.nextInt();

        rotate(list,k); // java collection rotate function



        System.out.println(list.toString());

    }
}
