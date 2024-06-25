public class largest3 {
    public static void main(String[] args)
    {
        int a=12;
        int b=14;
        int c=31;
        if(a>=b && b>=c)
            System.out.println("a is greater"+ a);
        else if(b>=a && a>=c)
            System.out.println("b is greater"+ b);
        else
            System.out.println("c is grester"+ c);
    }
}
