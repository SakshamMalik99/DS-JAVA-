import java.util.*;
import java.util.Stack;

class SearchMethod {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }