import java.util.*;
public class push_at_botm
{
    public static void bottom(Stack<Integer> s, int data) 
    {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s,data);
        s.push(top);
    }  
    public static void main(String args[])
    {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        bottom(s,4);
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}