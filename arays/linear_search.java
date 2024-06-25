public class linear_search{
    public static int linear(int marks[],int key)
    {
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[]={4,2,71,84,36,45,69};
        int key=45;
        int index=linear(marks,key);
        if(index==-1)
        {
            System.out.println("not found ");
        }
        else
        {
            System.out.println(" key is at index "+index);
        }
    }
}