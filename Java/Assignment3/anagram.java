package Assignment3;

import java.util.Arrays;
import java.util.Locale;

public class anagram {

    public static void main(String[] args) {
        String st1 = "Amit";
        String st2 = "tima";

        boolean res = isAnagram(st1,st2);


        if(res) {
            System.out.println("Strings are Anagram");
        }
        else {
            System.out.println("Strings are not Anagram");
        }


    }

    private static boolean isAnagram(String st1, String st2) {

        int[] string1 = new int[256];
        int[] string2 = new int[256];

        st1 = st1.toLowerCase(Locale.ROOT); // ignoring cases of string
        st2 = st2.toLowerCase(Locale.ROOT); // ignoring cases of string

        Arrays.fill(string1,0);
        Arrays.fill(string2,0);

        for (int i=0;i<st1.length();i++){
            string1[st1.charAt(i)]++; // counting appearance of each character present in string st1
        }


        for (int i=0;i<st2.length();i++){
            string2[st2.charAt(i)]++; // counting appearance of each character present in string st2
        }


        for (int i=0; i<256;i++){
            if(string1[i]!=string2[i]){ // if appearance of character present in string st1 and string st2 is not equal then it means string is not anagram
                return false;
            }
        }
        return true;
    }
}
