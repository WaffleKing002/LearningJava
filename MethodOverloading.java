class newCalculator
{
    int a;

    public int add(int n1,int n2, int n3)
    {
        return n1 + n2 +n3;

    }
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public double add(double n1,int n2)
    {
        return n1 + n2;
    }



}


public class MethodOverloading
{
    public static void main(String args[]) {

        newCalculator obj = new newCalculator();
        int n1 = 9;
        int n2 = 12;
        int r1 = obj.add(n1, n2);

        System.out.println(r1);


    }
}


