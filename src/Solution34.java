import java.util.*;

public class Solution34 {

    public static void main(String[] args) {

        int[] answers = {1, 3, 2, 4, 2};
        int[] answer = {};

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        HashMap<Integer, Integer> map = new HashMap<>(3);

        for (int i=0; i<answers.length;i++){

            if(p1[i%5]==answers[i])map.put(1, ++score1);
            if(p2[i%8]==answers[i])map.put(2, ++score2);
            if(p3[i%10]==answers[i])map.put(3, ++score3);

        }

        int max = Collections.max(map.values());

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue().equals(max)){
                list.add(entry.getKey());
            }
        }

        answer = list.stream().mapToInt(i->i).toArray();

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int num : answers){
//            System.out.println(num);
        }
    }

}
