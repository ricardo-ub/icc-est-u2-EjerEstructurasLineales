package utils;

import java.util.Stack;

public class StackSorter {
    
    public void sortStack(Stack<Integer> stack){
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int tope = stack.pop();

            while (!aux.isEmpty() && aux.peek() > tope) {
                stack.push(aux.pop());
            }

            aux.push(tope);
        }

        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
        
    }
}