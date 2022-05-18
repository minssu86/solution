public class Solution05 {
    public int solution(String s) {
        int answer = 0;

        if (s.substring(0,1)== "-"){
            return answer = Integer.parseInt(s.substring(1,s.length()))*-1;
        } else if (s.substring(0,1)== "+"){
            return answer = Integer.parseInt(s.substring(1,s.length()));
        }

        return answer = Integer.parseInt(s);
    }
}
