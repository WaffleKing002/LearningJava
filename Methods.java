
    class MobilePhone
    {
        public void playMusic()
        {
            System.out.println("Music Playing...");
        }

        public String getMeAPen(int cost)
        {
            if(cost >= 10)
                return "Pen";
            return "You get absolutely nothing!";
        }
    }




 public class Methods
 {
     public static void main(String args[])
     {
         MobilePhone obj = new MobilePhone();
         obj.playMusic();
         int cost = 3;
         String str = obj.getMeAPen(cost);
         System.out.println(str);
     }
 }

