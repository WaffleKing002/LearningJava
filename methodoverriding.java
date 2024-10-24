class A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in a config");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In another show");
    }
}



public class methodoverriding
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
