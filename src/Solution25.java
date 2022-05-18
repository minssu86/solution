public class Solution25 {

    public static void main(String[] args) {
        long n = 121;

//        for(long x = 1; x*x<50000000000000l; x++){
//
//            if(x*x==n){
//                System.out.println((x+1)*(x+1));
//            }
//
//        }

        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            System.out.println((long) Math.pow(Math.sqrt(n) + 1, 2));
        }

        //==================

//        double i = Math.sqrt(n);
//        System.out.println(Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1);
        System.out.println(-1);


    }


}

//
//        if (Math.pow((int)Math.sqrt(n), 2) == n) {
//         return (long) Math.pow(Math.sqrt(n) + 1, 2);
//         }
//
//         return -1;
//
//         double i = Math.sqrt(n);
//
//         return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;