package utils;

import java.util.Stack;

public class SignValidator {
    
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char signo : s.toCharArray()) {
            if (signo=='(' || signo=='{' || signo=='[') {
                stack.push(signo);

            }else if (signo==')' || signo=='}' || signo==']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char ultimo = stack.pop();
                if ((signo==')' && ultimo!='(') || (signo=='}' && ultimo!='{') || (signo==']' && ultimo!='[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
