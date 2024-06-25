import java.util.Scanner;

public class whlsum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        while(i<=n)
        {
            s=s+i;
            i++;
        }
        System.out.println("sum is "+ s);
    }
}
