import java.util.*;

public class Solution35 {

    public static void main(String[] args) {

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = {};

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> oriMap = new HashMap<>();
        for(int i=0; i<strings.length;i++){
            StringBuffer sb = new StringBuffer();
            if(strings[i].length()!=1){
                sb.append(strings[i]);
                map.put(i, strings[i].substring(n-1, n)+sb.deleteCharAt(n-1));
            }
            oriMap.put(i, strings[i]);
            System.out.println(oriMap.get(i));
            System.out.println(map.get(i));
        }


        List<Map.Entry<Integer, String>> entryList = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
//        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>());


        answer = new String[map.size()];
        for (int i=0; i<map.size();i++){
//            tempList.add(map.keySet());
        }

        for(String ans : answer){
//            System.out.println(ans);
        }

    }

}

