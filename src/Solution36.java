import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution36 {

    public static void main(String[] args) {
        String s = "ZbcdefZg";
        String answer = "";


        String[] arrCh = s.split("");
        Arrays.sort(arrCh,Collections.reverseOrder());


        for (String str : arrCh){
            answer += str;
        }





        System.out.println(answer);

    }

}
