public class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long result = money - (long)price*count*(1 + count)/2;

        return answer = result>0?0:result*-1;
    }
}


//    public long solution(int price, int money, int count) {
//        long answer = -1;
//
//        long result = money - (long)price*count*(1 + count)/2;
//
//        return answer = result>0?0:result*-1;
//    }