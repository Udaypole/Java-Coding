import java.util.*;
public class coin
{
    public static void main(String args[])
    {
        int coins[] ={1,2,5,10,20,50,100,500,1000,2000};
        int amt = 590;
        Arrays.sort( coins, Comparator.reverseOrder());

        int c= 0;
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<amt)
            {
                while (coins[i]<=amt)
                {
                    c++;
                    amt = amt-coins[i];
                }
            }
        }
        System.out.println(c);
    }
}