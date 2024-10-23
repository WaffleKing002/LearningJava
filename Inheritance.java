public class Inheritance
{
    public static void main(String args[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 9);
        int r2 = obj.sub(7, 8);
        int r3 = obj.multi(9, 12);
        int r4 = obj.div(23, 6);
        double r5 = obj.power(6, 7);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r5);
    }
}
