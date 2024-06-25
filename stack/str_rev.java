import java.util.*;
public class str_rev
{
    public static String rev(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty())
        {
            char cur = s.pop();
            res.append(cur);
        }
        return res.toString();
    }
    public static void main (String args[])
    {
        String str = "abe";
        String res = rev (str);
        System.out.println(res);
    }
}