public class Solution06 {
    public int solution(int[] numbers) {
        int answer = -1;

        int a = 1;
        int b = 9;
        answer = (a+b) * (b-a)/2 + (b+a)/2; //1~9까지의 합

        for(int num : numbers){
            answer -= num;
        }

        return answer;
    }
}
