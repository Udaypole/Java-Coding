import java.util.*;

public class stk_rev {

    public static void bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s, data);
        s.push(top);
    }

    public static void rev(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        rev(s);
        bottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.println(s.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original stack:");
        printStack(s);
        rev(s);
        System.out.println("Reversed stack:");
        printStack(s);
    }
}
