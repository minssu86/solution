public class Solution09 {
    public String solution(String phone_number) {
        String answer = "";

        String star="";
        String starPosition = phone_number.substring(0, phone_number.length()-4);
        for(int i = 0; i<phone_number.length()-4;i++){
            star += "*";
        }
        answer = phone_number.replace(starPosition, star);

        return answer;
    }


}
