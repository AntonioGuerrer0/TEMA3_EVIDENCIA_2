
package Listas;

import java.util.Stack;


public class BalanceoParentesis {

     public static boolean estaBalanceado(String expresion) {
        Stack<Character> stack = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expresion = "{[()]}";
        if (estaBalanceado(expresion)) {
            System.out.println("La expresion está balanceada.");
        } else {
            System.out.println("La expresion no está balanceada.");
        }
    }
}