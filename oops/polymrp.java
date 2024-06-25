public class polymrp
{
    public static void main(String[] args)
     {
        calci cal =new calci();
        System.out.println(cal.sum(1,3));
        System.out.println(cal.sum((float)1.0,(float)2.3));
        System.out.println(cal.sum(1,4));
    }
}
class calci
{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a,float b)
    {
        return a+b;
    }
    int sum (int a,int b,int c)
    {
        return a+b+c;
    }
}