public class subarrays2 {
    public static void sub(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
               int start=i;
             for(int j=i;j<nums.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                 System.out.print(nums[k]+" ");
                }
                 System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={12,9,7,2,5};
        sub(nums);
    }
}

