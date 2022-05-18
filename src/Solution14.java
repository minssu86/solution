public class Solution14 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        for(int num : arr){
            if(num%divisor == 0){
                count++;
            }
        }

        int[] answer = new int[count];

        int idx=0;
        for(int num : arr){
            if(num%divisor == 0){
                answer[idx++]=num;
            }
        }

        if(count == 0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        int temp = 0;
        for(int re = 0; re < count-1; re++){
            for(int i = 0; i <count-1; i++){
                if(answer[i] > answer[i+1]){
                    temp = answer[i];
                    answer[i] = answer[i+1];
                    answer[i+1] = temp;
                }
            }
        }
        return answer;
    }
}

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//        if(answer.length == 0) answer = new int[] {-1};
//        java.util.Arrays.sort(answer);
//        return answer;
//    }
//}