public class ovrrdng 
{
    public static void main(String[] args) 
    {
        deer d= new deer();
        d.eat(); // over riding it means it is only printing the child function
    }
    
}
class Animal
{
    void eat()
    {
        System.out.println("eats");
    }
}
class deer extends Animal
{
    void eat()
    {
         System.out.println("eats");
    } 
}