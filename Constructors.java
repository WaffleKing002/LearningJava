
class Person
{
    private int age;
    private String name;

    public Person()
    {
        age = 45;
        name = "Jack";
    }
    public Person(int a, String n)
    {
        age = a;
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}




public class Constructors
{
    public static void main(String args[])
    {
        Person obj = new Person();
        Person obj1 = new Person(78, "MJ");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + ": " + obj.getAge());
    }
}
