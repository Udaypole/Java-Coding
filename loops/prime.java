import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2)
            System.out.println("n is primw");
        else
        {
            boolean isPrime=true;
            for(int i=2;i<n;i++)// i<=Math.sqrt(n) which means i should be go upto root n for long numbers;
            {
                if(n%i==0)
                    isPrime=false;
            }
             if(isPrime==true)
                System.out.println("n is prime");
            else
                System.out.println("n is not prime");
        }
    }
}
