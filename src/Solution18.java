import java.util.Arrays;

public class Solution18 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String answer = "";

        answer = String.valueOf(Arrays.asList(seoul).indexOf("Kim"));

        System.out.println("김서방은 " + answer + "에 있다");
    }
}
