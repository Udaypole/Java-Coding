import java.util.Scanner;
public class circle
{
    Scanner sc=new Scanner (System.in);
    float radius;
    public circle( float radius)
    {
        this.radius=radius;
    }
    float getarea()
    {
        return 3.14f*radius*radius;
      
    }
    float getpert()
    {
        return 2*3.14f*radius;
        

    }
    public  static void main(String args[])
    {
        circle c1=new circle(2f);
        System.out.println(c1.getarea());
        System.out.println(c1.getpert());
    }
}