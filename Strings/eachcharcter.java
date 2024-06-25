public class eachcharcter {
    public static void prletter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        String str="udaypole";
        prletter(str);
        System.out.println();
    }
}
