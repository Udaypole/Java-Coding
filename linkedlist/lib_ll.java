import java.util.LinkedList;
public class lib_ll
{
    public static void main(String args[])
    {
    // creatiom
        LinkedList<Integer> ll= new LinkedList<>();

            // add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

    }
}