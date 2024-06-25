public class fast_expnt {
    public static int set(int a,int n)
    {
        int ans=0;
        while(n>0)
        {
            if((n  & 1 )!=0)
            {
                ans=ans*a;
            }    
            a=a*a;
            n=n>>1 ;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(set(5,3));
    }
}
