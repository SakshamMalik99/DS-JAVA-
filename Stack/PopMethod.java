import java.util.Stack;

class PopMethod {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        String element = animals.pop();
        System.out.println("Removed Element: " + element);
    }
}