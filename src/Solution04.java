public class Solution04 {
    public long solution(int a, int b) {
        long answer = 0;

        int c;
        if(a > b){
            c = a;
            a = b;
            b = c;
        }

        if((b-a)%2 == 1){
            answer = (a+b) * (b-a+1)/2;
        }else{
            answer = (a+b) * (b-a)/2 + (b+a)/2;
        }

        return answer;
    }
}
