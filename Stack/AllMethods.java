import java.io.*;
import java.util.*;
import java.util.Stack;

class AllMethods {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        String element1 = animals.peek();
        System.out.println("Element at top: " + element1);
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}