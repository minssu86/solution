public class Test0517 {

    public static void main(String[] args) {
        Test0517 method = new Test0517();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }


    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        for(int i=0; i<arr1.length;i++){
            if(arr2[i]>28){
                answer += 21 - arr1[i];
            } else {
                answer += arr2[i] - arr1[i];
            }
        }
        return answer;
    }

}
