public class consructor {
    public static void main(String[] args) {
        Student s1 = new Student("uday");
        System.out.println(s1.name);
        Student s2 = new Student();
        Student s3 = new Student(123);
    
    }
}
class Student
{
    String name;
    int roll;

    Student(String name)  // parametered constructor
    {
        this.name=name;
    }
    Student( )
    {
        System.out.println(" the unparametred constructor");
    }
    Student(int roll)
    {
        this.roll=roll;
    }
}