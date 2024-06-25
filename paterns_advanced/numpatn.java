public class numpatn
{
    public static  void patt(int rows,int cols)
    {

        for(int i=1;i<=rows;i++)
        {
               int k=1;
            for(int j=1;j<=cols;j++)
            {
            
                if(i==1 || i==rows || j==1 || j==cols)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print(" ");
                }
                k++;
               
            }
          
          System.out.println();
           
        }
       
    }
    public static void main(String[] args) {
        patt(4,4);
    }
}