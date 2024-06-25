import java.util.*;
public class maxwater // brute force tc = O(n^2)
{
    public static int storewater (ArrayList<Integer>height)
    {
        int mx=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int ht=Math.min(height.get(i),height.get(j));
                int width = j-i;
                int curr= ht*width;
                mx=Math.max(mx,curr);
            }
        }
        return mx;
    }
    // optimal - O(n)
    public static int opt (ArrayList<Integer> height)
    {
        int mx=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp < rp)
        {
            // calu water area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int cur=ht*width;
            mx=Math.max(mx,cur);

            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return mx;
    }
   

    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(" brute force = " + storewater(height)); 
        System.out.println(" optimal  = " + opt(height));
    }
}