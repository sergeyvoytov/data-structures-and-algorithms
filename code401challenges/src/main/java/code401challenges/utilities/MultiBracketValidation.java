package code401challenges.utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {

        if (input == null)
            return true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char bracket = input.charAt(i);
            if (bracket == '[') {
                stack.push(']');
            }
            if (bracket == '(') {
                stack.push(')');
            }
            if (bracket == '{') {
                stack.push('}');
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty() || stack.pop() != bracket)
                    return false;
            }
        }
        //stack is empty
        return stack.isEmpty();
    }
}