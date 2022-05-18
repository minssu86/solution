import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Solution40 {

    public static void main(String[] args) {

        String new_id = "abcdefghijklmn.p";

        // 1단게
        new_id = new_id.toLowerCase();
        System.out.println("1단계 : " + new_id);

        // 2단계
        String pattern = "[a-z0-9-_.]";
        String temp;
        String answer="";
        for (int i=0; i<new_id.length(); i++){
            temp = ""+ new_id.charAt(i);
            if(Pattern.matches(pattern, temp)){
                answer += new_id.charAt(i);
            }
        }
        System.out.println("2단계 : " + answer);

        // 3단계
        answer = answer.replaceAll("\\.+", ".");
        System.out.println("3단계 : " + answer);

        // 4단계
        if(answer.charAt(0)=='.')answer = answer.substring(1);
        if(answer.length()!=0){
            if(answer.charAt(answer.length() - 1)=='.'){
                answer = answer.substring(0,answer.length()-1);
            }
        }

        System.out.println("4단계 : " + answer);

        // 5단계
        if(answer.length()==0)answer="a";
        System.out.println("5단계 : " + answer);

        // 6단계
        if(answer.length()>15)answer=answer.substring(0,15);
        System.out.println("6단계 : " + answer);
        if(answer.length()!=0){
            if(answer.charAt(answer.length() - 1)=='.'){
                answer = answer.substring(0,answer.length()-1);
            }
        }


        // 7단계
        if(answer.length()<3){
            String temp2 = answer.substring(answer.length() - 1);
            while (answer.length()<3){
                answer += temp2;
            }
        }
        System.out.println("7단계 : " + answer);


    }

}
