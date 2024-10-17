
class Human
{
    private int age = 22;
    private String name = "Mustard";

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}


public class Encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
