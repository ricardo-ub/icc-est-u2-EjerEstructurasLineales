import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "}[(]{)";
        String cadena2 = "{([])({[]})}";

        System.out.println("Ejercicio 01: Validación de signos");
        System.out.println("Cadena: " + cadena1 + " | Resultado: " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " | Resultado: " + signValidator.isValid(cadena2));

    }

    private static void runStackSorter() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(89);
        stack.push(7);
        stack.push(11);
        stack.push(5);

        StackSorter sorter = new StackSorter();

        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack original: " + stack);
        sorter.sortStack(stack);
        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }

    private static void runQueuePalindrome() {
        QueuePalindrome queuePalindrome = new QueuePalindrome();

        System.out.println("\nEjercicio 03: Palíndromo usando Colas");
        String texto1 = "REcoNocEr";
        String texto2 = "La RUTA nOs ApOrtO otrO pASO NatuRAl".toLowerCase();
        System.out.println("Texto: " + texto1 + " | Resultado: " + queuePalindrome.isPalindrome(texto1.toLowerCase()));
        System.out.println("Texto: " + texto2 + " | Resultado: " + queuePalindrome.isPalindrome(texto2.replaceAll("\\s+", "")));
    }
}
