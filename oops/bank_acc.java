public class bank_acc {
    public static void main(String[] args)
     {
        bankacc myacc=new bankacc();
        myacc.username = "uday";
        myacc.set("abcdefghi");
    }
}
class Bankacc 
{
    public String username;
    private String password;
    default static void set(String pwd) {
        password = pwd;   
    }
}