public class count_set_bits {
    public static int set(int n)
    {
        int c=0;
        while(n>0)
        {
            if((n  & 1 )!=0)
                c++;
            n=n>>1 ;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(set(10));
    }
}
