import java.util.*;

public class Activity
{
    public static void main(String args[])
    {
        int start [] = {1,3,0,5,8,5};
        int end [] =  {2,4,6,7,9,9};
        int max =1;
        int le = end[0];
        for(int i=0;i<end.length;i++)
        {
            if(start [i] >= le)
            {
                max++;
                le = end[i];
            }
        }
        System.out.println("max Actiity = "+max);
    }
}