import java.util.Stack;

public class EvaluatePostfix {
    public static int postfixEval(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int x = stack.pop();
                int y = stack.pop();
                if (c == '+') {
                    stack.push(y + x);
                } else if (c == '-') {
                    stack.push(y - x);
                } else if (c == '*') {
                    stack.push(y * x);
                } else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "138*+";
        System.out.println(postfixEval(exp));
    }
}