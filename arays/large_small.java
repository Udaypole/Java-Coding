public class large_small {
  public static int largest(int nums[])
  {
       int largest=Integer.MIN_VALUE;
       int smallest=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++)
       {
            if(largest<nums[i])
            {
                largest=nums[i];
            }    
       }
       for(int j=0;j<nums.length;j++)
       {
            if(smallest>nums[j])
            {
                smallest=nums[j];
            }    
        }
      System.out.println("smallest value is "+smallest);
       return largest;
    } 
    public static void main(String[] args) {
        int nums[]={1,9,5,7,3,8};
        System.out.println("largest is "+largest(nums));
    }
}
