import java.util.ArrayList;
import java.util.List;

public class Solution31 {

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        int num = 10;
        for(int i=0; i<arr.length; i++){
            if(num!=arr[i]){
                list.add(arr[i]);
                num=arr[i];
            }else list.add(0);
        }

        answer = list.stream().mapToInt(i->i).toArray();

        System.out.println(answer);

    }

}
