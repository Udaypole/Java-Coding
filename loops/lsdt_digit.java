public class lsdt_digit {
    public static void main(String[] args) {
        int n=10899;
        while(n>0)
        {
           int l=n%10;
            System.out.println(l);
            n=n/10;
        }
        System.out.println();
    }
}
