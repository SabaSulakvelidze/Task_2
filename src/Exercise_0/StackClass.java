package Exercise_0;

import java.util.*;

public class StackClass implements Runnable{
    static void stack_push(Stack<String> stack) {
        System.out.println("Push Operation : ");
        stack.push("Queen");
        stack.push("King");
        stack.push("Ace");

        System.out.println(stack);
    }

    static void stack_pop(Stack<String> stack) {
        System.out.println("Pop Operation:");
        stack.pop();
        System.out.println(stack);
    }

    static void stack_peek(Stack<String> stack) {
        String element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<String> stack, String element) {
        int pos = stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

    public static void performStackOperations(){
        Stack<String> stack = new Stack<>();

        StackClass.stack_push(stack);
        StackClass.stack_pop(stack);
        StackClass.stack_peek(stack);
        StackClass.stack_search(stack, "King");
        StackClass.stack_search(stack, "Ace");
    }

    @Override
    public void run() {
        performStackOperations();
    }
}
