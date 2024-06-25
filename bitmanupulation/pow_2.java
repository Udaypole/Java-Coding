public class pow_2 {
    public static boolean ispow(int n)
    {
        return (n & (n-1))==0;
    }
    public static void main(String args[])
    {
        System.out.println(ispow(8));
    }
}
