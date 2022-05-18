public class Solution30 {

    public static void main(String[] args) {

        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int answer = 0;

        int max = 0;
        int min = 0;



        for(int[] size : sizes){
            int check1, check2 = 0;
            check1 = size[0]>size[1]?0:1;
            check2 = size[0]>size[1]?1:0;
            max=max<size[check1]?size[check1]:max;
            min=min<size[check2]?size[check2]:min;
        }

        answer = max * min;
        System.out.println(answer);

    }

}
