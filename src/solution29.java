import java.util.Stack;

public class solution29 {

    public static void main(String[] args) {

        int n = 125;
        int answer = 0;

        Stack<Integer> tritStack = new Stack<>();

        while (n>0){
            tritStack.push(n%3);
            n = n/3;
        }

        System.out.println("===========");
        int size = tritStack.size();
        for(int i=0; i<size;i++){
            answer+=tritStack.pop()*(Math.pow(3, i));
        }

        System.out.println(answer);
    }

}
