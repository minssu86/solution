public class Solution39 {

    public static void main(String[] args) {

        String s = "a B z";
        int n = 4;

        char[] arrChar = s.toCharArray();

        String answer = "";
        for(char ch : arrChar){
            if(ch>96){
                if(ch == ' '){
                    answer += ' ';
                } else if(ch+n>122){
                    answer += (char)(ch+n-26);
                } else {
                    answer += (char)(ch+n);
                }
            } else {
                if(ch == ' '){
                    answer += ' ';
                } else if(ch+n>90){
                    answer += (char)(ch+n-26);
                } else {
                    answer += (char)(ch+n);
                }
            }
        }

        System.out.println(answer+"");

    }

}
