import java.util.*;
public class fraKnapsack
{
    public static void main(String args[])
    {
        int value [] = {60,100,120};
        int weight [] = {10,20,30};
        int w = 50;

        int ratio [][] = new int [value.length][2];
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(int)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalvalue = 0 ;
        for(int i = ratio.length-1;i>=0;i--)
        {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx])
            {
                finalvalue += value[idx];
                capacity = capacity - weight[idx];
            }
            else
            {
                finalvalue += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = "+ finalvalue);
    }
}