import java.util.Scanner;
public class evnodd_sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int n=1;
        int esum=0;
        int odsm=0;
        while(n!=0)
        {
            System.out.println("enter a number-");
            n=sc.nextInt();
            if(n%2==0){
                esum++;
            }
            else{
                odsm++;
            }
        }
         System.out.println(esum);
          System.out.println(odsm);
    }
}
