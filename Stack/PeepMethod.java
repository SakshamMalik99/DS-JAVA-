import java.util.Stack;

class PeekMethod {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        String element = animals.peek();
        System.out.println("Element at top: " + element);

    }
}