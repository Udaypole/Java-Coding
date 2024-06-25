public class Lamp
{
    boolean ison;
    String Ltype;
    public Lamp( boolean n)
    {
        if(n)
            turnon();
        else
            turnOff();
        
    }
    void turnOff()
    {
        System.out.println(" lamp is off");
      
    }
    void turnon()
    {
        System.out.println(" lamp is on");
    }
    public  static void main(String args[])
    {
        Lamp l=new Lamp(true);
       // System.out.println(l.turnoff());
       // System.out.println(l.turnon());
    }
}