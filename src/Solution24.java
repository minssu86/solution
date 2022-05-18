import java.util.Arrays;
import java.util.Collections;

public class Solution24 {

    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;

        String[] arrNum = Long.toString(n).split("");
        Arrays.sort(arrNum, Collections.reverseOrder());

        String tempStr = "";
        for(String str : arrNum){
            tempStr += str;
        }

        answer = Long.parseLong(tempStr);

        System.out.println(answer);
//        String[] arrNum = Long.toString(n).split("");
//
//        String temp = "";
//        for(int j=0; j<arrNum.length-1; j++){
//            for(int i=0; i<arrNum.length-1; i++){
//                System.out.println(Integer.parseInt(arrNum[i]));
//                if(Integer.parseInt(arrNum[i])<Integer.parseInt(arrNum[i+1])){
//                    temp = arrNum[i];
//                    arrNum[i] = arrNum[i+1];
//                    arrNum[i+1] = temp;
//                }
//            }
//        }
//
//        String strNum = "";
//        for(String str : arrNum){
//            strNum += str;
//        }
//
//        answer = Long.parseLong(strNum);


    }

}
