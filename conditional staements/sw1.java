import java.util.Scanner;
public class sw1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);
        switch(op)
        {
            case '+' : System.out.println((a+b));
                        break;
            case '-' : System.out.println((a-b));
                        break;
            case '*' : System.out.println((a*b));
                        break;
            case '%' : System.out.println((a%b));
                        break;
            case '/' : System.out.println((a/b));
                        break;
            
            default : System.out.println("oops");
                        break;
        }
    
}

}
