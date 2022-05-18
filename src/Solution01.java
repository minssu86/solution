import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int y=0; y < b ; y ++ ){
            for(int i=0; i < a ; i ++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
