import java.util.Arrays;

public class Solution20 {
    public static void main(String[] args) {
        String[] participant = 	{"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
//        String[] participant = 	{"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"stanko", "ana", "mislav"};
//        String[] participant = 	{"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0; i< participant.length;i++){
            if(i>completion.length-1){
                System.out.println(participant[i]);
                break;
            }
            if(participant[i] != completion[i]){
                System.out.println(participant[i]);
                break;
            }
        }


        System.out.println("=====================");

//        List<String> tempList = new ArrayList<String>();
//        tempList.addAll(Arrays.asList(completion));
//        for (String name : completion)tempList.add(name);
//
//        for(int i=0; i< participant.length; i++){
//            if(tempList.contains(participant[i])){
//                tempList.remove(participant[i]);
//            } else {
//                System.out.println(participant[i]);
//            }
//        }

//        System.out.println("=====================");

//        List<String> completionList = new ArrayList<String>();
//        completionList.addAll(Arrays.asList(completion));
//
//        List<String> participantList = new ArrayList<String>();
//        participantList.addAll(Arrays.asList(participant));
//
//        completionList.get
//        for(int i=0; i< participant.length; i++) {
//            if (Collections.frequency(participantList, participant[i]) != Collections.frequency(completionList, participant[i])) {
//                System.out.println(participant[i]);
//            }
//        }
//        System.out.println("=====================");




    }
}
