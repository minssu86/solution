public class Solution22 {

    public static void main(String[] args) {

        int n = 1204;
//        String num = Integer.toString(n);
        int answer = 0;
//        for(int i=0; i<num.length();i++){
//            answer += n%10;
//            n = n/10;
//        }

        for(String str: Integer.toString(n).split("")){
            answer += Integer.parseInt(str);
        }


        System.out.println(answer);
    }

}