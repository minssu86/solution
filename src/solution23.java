public class solution23 {

    public static void main(String[] args) {
        long n = 123456789123456l;
        int[] answer = {};

        String num = Long.toString(n);
        answer = new int[num.length()];
        for(int i=0; i< num.length(); i++){
            answer[i] = Integer.parseInt(num.split("")[num.length()-i-1]);
            System.out.println(answer[i]);
        }

    }

}
