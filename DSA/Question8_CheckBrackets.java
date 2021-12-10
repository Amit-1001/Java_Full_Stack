package DSA;

import java.util.Stack;

public class Question8_CheckBrackets {
    public static void main(String[] args) {
        String str= "{[()]}{}{";

        Stack<Character> st = new Stack<>();


        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c=='{' || c=='['||c=='('){
                st.push(c);
            }
            else if(c=='}' || c==']' || c==')'){
                if(st.isEmpty()) {
                    System.out.println("Brackets are not balanced");
                    System.exit(0);
                }
                char ch = st.peek();


               if(isMatching(ch,c)){
                   st.pop();
               }
               else {
                   break;               }


            }
        }

        if(st.isEmpty()){
            System.out.println("Bracket are balanced");
        }
        else {
            System.out.println("Bracket are not balanced");
        }


    }

    private static boolean isMatching(char c, char ch) {

        if(ch == '}' && c == '{'){
            return true;
        } else if(ch==')' && c=='('){
            return true;
        }
        else if (ch == ']' && c == '['){
            return true;
        }
        else
        {
            return false;
        }
    }
}
