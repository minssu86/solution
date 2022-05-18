public class Solution03 {
    public String solution(String s) {
        String answer = "";

        int startIdx = s.length() / 2;

        if(s.length() % 2 == 1) {
            answer = s.substring(startIdx, startIdx+1);
        }else{
            answer = s.substring(startIdx-1, startIdx+1);
        }

        return answer;
    }
}
