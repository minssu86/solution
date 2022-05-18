public class solution21 {


    public static void main(String[] args) {

        String s = "  try hello world sparta everyday";
        String answer ="";
        s.trim();
        s = s.replaceAll("\\s+", " ");
        for(String str: s.split(" ",-1)){
            boolean trueIsEven = true;
            for(int i = 0; i<str.length();i++){
                answer += trueIsEven?str.toUpperCase().charAt(i):str.toLowerCase().charAt(i);
                trueIsEven = !trueIsEven;
            }
            answer += " ";
        }

        System.out.println(answer.substring(0,answer.length()-1));

    }
}
