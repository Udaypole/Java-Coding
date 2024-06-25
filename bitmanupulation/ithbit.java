public class ithbit {
    public static int getbit(int n,int i)
    {
        int bit= 1<<i;   // 10 = 1 0 1 0 
        if((n & bit)==0) // so we have to get ith place it may be 0 r 1
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(getbit(10,2));
    }
}
