public class hollow_pat
{
    public static  void patt(int rows,int cols)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(i==1 || i==rows || j==1 || j==cols)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        patt(4,5);
    }
}