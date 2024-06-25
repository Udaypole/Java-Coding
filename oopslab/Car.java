class Demo
{
    String company;
    double mileage;
    double speed;
    String color;

    double getMilage()
    {
        return mileage;
    }
    double getspeed()
    {
        return speed;
    }
    void getcompany()
    {
        System.out.println(company);
    }
    void getcolor()
    {
        System.out.println(color);
    }
    public Demo(String n,double m,double s,String c)
    {
        company=n;
        mileage=m;
        speed=s;
        color=c;
    }
}
class Car
{
    public static void main(String[] args)
    {
      Demo d=new Demo("ford",30,40,"blue" );
      Demo d1=new Demo("toyata",70,100,"white" );
      Demo d2=new Demo("volksvogan",40,50,"marin" );
    
        double r1=d.getMilage()/d.getspeed();
        double r2=d1.getMilage()/d.getspeed();
        double r3=d2.getMilage()/d.getspeed();

        if(r1<=r2 && r2<r3)
            System.out.println("ford");
          else if(r2<=r3 && r3<r1)  
            System.out.println("toyata");
        else
            System.out.println("volksvogan");
    }
}