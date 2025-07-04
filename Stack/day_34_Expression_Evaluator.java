package Stack;

import java.util.Stack;

public class day_34_Expression_Evaluator {
    // Check precedence
    static int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return 0;
        }
    }

    // Check if operator is left-associative
    static boolean isLeftAssociative(char op) {
        return op != '^';
    }

    // Infix to Postfix
    static String infixToPostfix(String expr) {
        StringBuilder output = new StringBuilder();
        char[] tokens = expr.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : tokens) {
            if (Character.isDigit(c)) {
                output.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    output.append(" ").append(stack.pop());
                stack.pop(); // Remove '('
            } else if ("+-*/^".indexOf(c) != -1) {
                output.append(" ");
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()) &&
                       isLeftAssociative(c))
                    output.append(stack.pop()).append(" ");
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) output.append(" ").append(stack.pop());

        return output.toString().trim();
    }

    // Evaluate Postfix
    static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop(), a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push(Math.pow(a, b)); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "3+(2*4)-5";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
        double result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);
    }
}
