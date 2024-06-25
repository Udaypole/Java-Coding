public class in_hrt
{
    public static void main(String[] args) 
    {
        Fish Shark = new Fish ();
        Shark.eats();

        dog micheal = new dog();
        micheal.eats();
        micheal.breathe();
        micheal.legs = 4;
        System.out.println(micheal.legs);
    }
    
}
class Animal   // parent class 
{
    String color;

    

    void eats()
    {
        System.out.println("it eats");
    }
    void breathe()
    {
        System.out.println("it breaths");
    }
}

class Fish extends Animal // derived from parent class  "extends " is used to use above parent class
{
    int fins;

    void swim()
    {
        System.out.println("it swims")
    }
}
class mammal extends Animal // derived from parent class  "extends " is used to use above parent class
{
    int legs;
}
class dog extends mammal// derived from parent class  "extends " is used to use above parent class
{
    String breed;
}
