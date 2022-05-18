public class Solution17 {
    public boolean solution(String s) {
        boolean answer = false;

        char temp;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length();i++){
                temp = s.charAt(i);
                if(Character.isDigit(temp)){
                    answer = true;
                } else {
                    return false;
                }
            }
        }
        return answer;
    }
}


//class Solution {
//    public boolean solution(String s) {
//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                return true;
//            } catch(NumberFormatException e){
//                return false;
//            }
//        }
//        else return false;
//    }
//}
//
////======================================
//
//import java.util.*;
//
//class Solution {
//    public boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
//    }
//}
//
////======================================
//
//class Solution {
//    public boolean solution(String s) {
//        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
//    }
//}