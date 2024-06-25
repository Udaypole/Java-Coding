public class set_ith_bit {
    public static int getbit(int n,int i)
    {
        int bit= 1<<i;   
        
            return n | bit;
    }
    public static void main(String[] args) {
        System.out.println(getbit(10,2));
    }
}
