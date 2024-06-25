import java.util.*;
public class arrayl
{
    public static void main(String args[])
    {
        ArrayList<Integer> l= new ArrayList<>();
        ArrayList<String> l1= new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l1.add("uday");
        l1.add("sravs");
        l1.add("raj");
        l.remove(3);
        l1.remove("sravs");
        l.set(3,10);
        System.out.println(l);
        System.out.println(l1);
        // reverse print of l
        for(int i=l.size()-1;i>=0;i--)
        {
            System.out.println(l.get(i)+" ");
        }
        System.out.println("after sorting");

        Collections.sort(l);
        System.out.println(l);

        System.out.println("desc order");
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

    }
}