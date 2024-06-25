public class selectionsort
{
    public static void sort(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[minpos]>ar[j])
                {
                    minpos=j;
                }
            }
            int t=ar[minpos];
            ar[minpos]=ar[i];
            ar[i]=t;
        }
    }
    public static void print(int ar[] ) 
    {
        for(int i=0;i<ar.length;i++)
        {
             System.out.print(ar[i]+" ");
        }  
        System.out.println();
    }
    public static void main(String[] args) {
        int ar[]={1,3,5,2,4};
        sort(ar);
        print(ar);
    }
}