import java.util.*;
public class nxt_gtr
{
    public static void main(String args[])
    {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxt[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty())
            {
                nxt[i] = -1;
            }
            else
            {
                nxt[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxt.length;i++)
        {
            System.out.print(nxt[i]+" ");
        }
        System.out.println();
    }
}