package lab2;

import java.util.Scanner;

public class str
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        
        System.out.println  (s1.compareTo(s2));
        System.out.println  (s1.equals(s2));
        System.out.println  (s1.equalsIgnoreCase(s2));
    }
    
}
