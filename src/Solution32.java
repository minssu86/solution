import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution32 {

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1;i++){
            for(int j=i+1; j< numbers.length;j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        Integer[] temp = set.toArray(new Integer[0]);
        Arrays.sort(temp);
        int[] answer = Arrays.stream(temp).mapToInt(i->i).toArray();


        System.out.println(answer.toString());

    }

}
