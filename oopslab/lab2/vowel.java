package lab2;

public class vowel 
{
    public static void main(String[] args) 
    {
        String s="rguktbasar";
        int c=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)== 'e'|| s.charAt(i)=='i' || 
            s.charAt(i)=='o'|| s.charAt(i)== 'o' )
            {
                 c++;
            }
            else
           {
                k++;
           }
        }
    }
}
