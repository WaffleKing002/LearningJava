import java.util.*;
public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        ArrayList<Integer> outputlist = new ArrayList<>();
        for(char operation: data.toCharArray())

            switch(operation){
                case('i'):
                    value++;
                    break;
                case('d'):
                    value--;
                    break;
                case('s'):
                    value*=value;
                    break;
                case('o'):
                    outputlist.add(value);
                    break;
                default:
                    break;
            }

        int[] output = new int[outputlist.size()];
        for(int i=0; i < outputlist.size(); i++)
        {
            output[i] = outputlist.get(i);

        }
        return output;

    }
}