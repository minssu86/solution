import java.util.HashMap;

public class Solution38 {

    public static void main(String[] args) {

        String s ="one4seveneight";
        int answer = 0;

        String[][] arrStr = {

                {"0","zero"},   {"1","one"},    {"2","two"},
                {"3","three"},  {"4","four"},   {"5","five"},
                {"6","six"},    {"7","seven"},  {"8","eight"},
                {"9","nine"}
        };

        for(int i=0; i<arrStr.length;i++){
            s = s.replace(arrStr[i][1], arrStr[i][0]);
        }

        Integer.parseInt(s);

        System.out.println(s);
    }

}
