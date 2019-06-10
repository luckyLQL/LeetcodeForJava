import sun.invoke.empty.Empty;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        Boolean flag = true;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        Stack stack = new Stack() ;

        for (int i = 0; i < s.length(); i++) {
            if (map.keySet().contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (map.values().contains(s.charAt(i))) {
                if (!stack.isEmpty() && map.get(stack.peek()) == s.charAt(i) ) {
                    stack.pop();
                } else {
                    flag = false;
                    return flag;
                }
            } else {

            }
        }
        return stack.isEmpty() ? true:false;

    }

    public static void main(String[] args) {
        ValidParentheses_20 test = new ValidParentheses_20();
        System.out.println(test.isValid("()[]]"));
    }

}
