public class solution28 {

    public static void main(String[] args) {

        boolean answer = true;
        int x = 10;

        int sum = 0;
        int tempNum = x;
        while(tempNum>0){
            sum += tempNum%10;
            tempNum/=10;
        }

        answer = x%sum==0?true:false;

        System.out.println(answer);
    }

}
