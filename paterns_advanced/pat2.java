public class pat2 {
    public static void patn(int n)
    {
        int k=1;
       for(int i=1;i<=n;i++)
       {
             
            for(int j=1;j<=n;j++)
            {
              
                if((i+j)%2==0)
                {
                    System.out.print(k+" ");
                }
                else
                {
                        
                        System.out.print( k+" ");
                        System.out.println();
                }
            }
            k++;
            
       }
       
    }
    public static void main(String[] args) {
        patn(3);
    }
}
