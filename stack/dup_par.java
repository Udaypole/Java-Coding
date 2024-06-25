import java.util.*;

public class dup_par
{
    public static boolean dup(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch ==')')
            {
                int c =0;
                while(s.peek()!='(')
                {
                    s.pop();
                    c++;
                }
                if(c<1)
                {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String str="(a+b)";
        System.out.println(dup(str));
        String str2="(((a+b)))";
        System.out.println(dup(str2));
    }
}