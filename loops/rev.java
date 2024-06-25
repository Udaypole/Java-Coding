public class rev {
    public static void main(String[] args) {
        int n=1021;
        int b=0;
        while(n>0){
            int ld=n%10;
            b=(b*10)+ld;
           n=n/10;
        }
        System.out.println(b);
    }
}
