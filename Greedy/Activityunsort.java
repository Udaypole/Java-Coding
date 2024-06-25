import java.util.*;

public class Activityunsort
{
    public static void main(String args[])
    {
        int start [] = {1,3,0,5,8,5};
        int end [] =  {2,4,6,7,9,9};  // if end time was given not in sorted order

        int Activity[][] = new int [start.length][3];
        for(int i=0;i<start.length;i++)
        {
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }
    
        Arrays.sort(Activity ,Comparator.comparingDouble(o -> o[2]));

        int max = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        max = 1;
        ans.add(Activity[0][0]);

         max =1;
        int le = Activity[0][2];
        for(int i=1;i<end.length;i++)
        {
            if(Activity[i][1] >= le)
            {
                max++;
                ans.add(Activity[i][0]);
                le = Activity[i][2];
            }
        }
        System.out.println("max Actiity = "+max);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A" + ans.get(i)+"  ");
        }
        System.out.println();
    }
}