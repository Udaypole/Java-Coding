public class evn_odd
{
    public static void evn(int n)
    {
        int i=1;
        if((n & i)==0)
            System.out.println("even number");
        else    
            System.out.println("odd number");
    }
    public static void main(String[] args) {
        evn(3);
        evn(10);
    }
}