public class bintodecimal {
    public static void bintodecimal(int binNum)
    {
        int n=binNum;
        int pow=0;
        int dec=0;
        while(binNum>0)
        {
            int lastdigit=binNum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
 
            pow++;
            binNum=binNum/10;

        }
        System.out.println("decimal of  "+ n +" = "+dec);
    }
    public static void main(String[] args) {
        bintodecimal(101);
    }
}
