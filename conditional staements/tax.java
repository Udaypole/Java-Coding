import java.util.Scanner;

public class tax {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int tx;
        if(n<5000){
            tx=0;
        }
        else if(n>=5000 && n<10000){
            tx=((int)(n*0.2));
        }
        else{
           tx=((int)(n*0.3));
        } 
         System.out.println(tx);
}
}