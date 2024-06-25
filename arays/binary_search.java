public class binary_search {
    public static int binary_src(int nums[],int key)
    {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==key)
            {
                return mid;
            }
                
            if(nums[mid]<key)
            {
                  start=mid+1;
            }
            else 
            {
                    end=mid+1;
            }     
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,9,8,10,7,4};
        int key=4;
        System.out.println("index is "+binary_src(nums,key));
    }
}
