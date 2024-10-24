public class Kata
{
    public static String evenOrOdd(int number)
    {
        if (number % 2 == 0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }

    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(8));
        System.out.println(evenOrOdd(5));
    }
}