import java.util.*;
public class addList
{
    public static void main (String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }
        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);
        System.out.println(mainlist);
        //nested loops
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> c = mainlist.get(i);
            for(int j=0;j<c.size();j++)
            {
                System.out.println(c.get(j)+" ");
            }
            System.out.println();
        }
    }
}