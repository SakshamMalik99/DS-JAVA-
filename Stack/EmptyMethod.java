import java.util.Stack;

class EmptyMethod {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}