public class binocoff {
    public static int fct(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int bcoff(int n,int r)
    {
        int fact_n=fct(n);
        int fact_r=fct(r);
        int nmr=fct(n-r);
        int bcoff=fact_n/(fact_r*nmr);
        return bcoff;
    }
    public static void main(String[] args) 
    
    {
        System.out.println(bcoff(5,2));
    }

    
}
