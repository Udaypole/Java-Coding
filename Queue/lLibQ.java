import java.util.*;

public class lLibQ
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>(); // in library function enque is  " ADD " and deque is " REMOVE "
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}