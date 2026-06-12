package utils;

import java.util.Deque;
import java.util.LinkedList;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text){  
        Deque<Character> cola = new LinkedList<>();
        for (char letra : text.toCharArray()) {
            cola.addLast(letra);
        }

        while (cola.size()>1) {
            char primero = cola.removeFirst();
            char ultimo = cola.removeLast();
            if (primero!=ultimo) {
                return false;
            }
        }
        return true;
        
    }
}
