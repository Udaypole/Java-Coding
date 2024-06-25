public class subaraays {
    public static void sub(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
             int curr=nums[i];
             for(int j=i+1;j<nums.length;j++)
            {
                System.out.print("("+curr+","+nums[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={12,9,7,2,5};
        sub(nums);
    }
}

