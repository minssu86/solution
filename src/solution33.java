import java.util.Arrays;
public class solution33 {

    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};


        int zero = 0;
        int win = 0;
        for(int num : lottos) {
            if(num==0)zero++;
            for(int w: win_nums){
                if(w==num)win++;
            }
            //            if(Arrays.asList(win_nums).contains(num))win++;
        }
        int[] answer = {Math.min(7-win-zero,6), Math.min(7-win,6)};

        for (int i=0; i< answer.length;i++){
            System.out.println(answer[i]);
        }


    }

}
