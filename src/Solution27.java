public class Solution27 {


    public static void main(String[] args) {

        long num = 626331;

        int cnt=0;
        while (cnt<500){
            if(num == 1)break;

            if(num%2 == 0){
                num/=2;
            } else {
                num*=3;
                num++;
            }
            cnt++;
        }

        if(cnt >= 500){
            cnt = -1;
        }

        System.out.println(cnt);

    }


}
