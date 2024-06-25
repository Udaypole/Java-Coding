import java.util.Scanner;

public class wh3 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range");
        int r=sc.nextInt();
        int c=0;
        while(c<r){
            System.out.println(c + " ");
            c++;
        }
    }
}
