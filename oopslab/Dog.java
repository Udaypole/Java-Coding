import java.util.Scanner;
 class Demo
{
    String name;
    String breed;
    String color;
    double height;
    String type;

    public String getBreed()
    {
        return breed;
    }
    public String getName()
    {
        return name;
    }
    public String getcolor()
    {
        return color;
    }
    public Demo(String n,String b,String c,double h,String t)
    {
        name=n;
        breed=b;
        color=c;
        height=h;
        type=t;
    }
}
class Dog
{
    public static void main(String[] args)
    {
        Demo d1=new Demo("snoopy","pomerian","whithe",2,"guard");
        Demo d2=new Demo("rocky","lab","brown",3,"sniffer");
        Demo d3=new Demo("snowy","p","black",2,"shepard");

        Scanner sc=new Scanner(System.in);
        System.out.println("choose the breed");
        int b=sc.nextInt();
        switch(b)
        {
            case 1 :
                        System.out.println(d1.getName());
                        System.out.println(d1.getcolor());
                        System.out.println(d1.getBreed());
                        break;

            case 2 :
                        System.out.println(d2.getName());
                        System.out.println(d2.getcolor());
                        System.out.println(d2.getBreed());
                        break;
             
            case 3 :
                        System.out.println(d3.getName());
                        System.out.println(d3.getcolor());
                        System.out.println(d3.getBreed());
                        break;
            
            default :
                            System.out.println("enter proper ip");

                            break;
     }

    }
}