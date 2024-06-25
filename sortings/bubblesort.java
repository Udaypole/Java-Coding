public class bubblesort
{
    public static void sort(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
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
        int ar[]={5,4,1,3,2};
        sort(ar);
        print(ar);
    }
}