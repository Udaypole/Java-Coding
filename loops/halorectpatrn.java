public class halorectpatrn {
  public static void main(String [] args) 
  {
    int n=4;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==2 && j==2 || j==3)
            {
                System.out.print(" ");
            }
            else if(i==3 && j==2 || j==3)
            {
                System.out.print(" ");
            }
            else
            {
                 System.out.print(" * ");
            }
             
        }
        System.out.println();
    }
  }
}
