public class ckeckingifandelse {
    public static void main(String[] arags){
        int age=13;
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("child");
        }
    }
}
