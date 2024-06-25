package lab2;

import java.util.Scanner;

public class strind 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1="sravyamadasu";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
             int index=s1.indexOf("a",i);
             i=index;
             count++;
        }
          System.out.println(count);
}
}
