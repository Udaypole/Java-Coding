public class invertpat2 {
    public static void patt(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)     // spaces
            {
                System.out.print("*");
            }
            for( int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        patt(4);
    }
}
