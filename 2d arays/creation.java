
import java.util.Scanner;
public class creation
{
    public static void main(String args[])
    {
        int mat[][]=new int [3][3];
        int n=mat.length,m=mat[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        // output

         for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              System.out.print(mat[i][j]+" ");
            }
        }


    }
}