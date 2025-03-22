import java.util.*;
import java.util.Stack;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (!st.isEmpty() && 
                    ((st.peek() == '(' && c == ')') || 
                     (st.peek() == '{' && c == '}') || 
                     (st.peek() == '[' && c == ']'))) {
                    st.pop();
                } else {
                    System.out.println("False");
                    return; 
                }
            }
        }
        System.out.println(st.isEmpty() ? "True" : "False");
    }
}

