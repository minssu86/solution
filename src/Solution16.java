public class Solution16 {
    boolean solution(String s) {

        long i,j=0;
        i = s.toLowerCase().chars().filter(c->c=='p').count();
        j = s.toLowerCase().chars().filter(c->c=='y').count();

        return i==j;
    }
}



//    boolean solution(String s) {
//
//        long i,j=0;
//        i = s.toLowerCase().chars().filter(c->c=='p').count();
//        j = s.toLowerCase().chars().filter(c->c=='y').count();
//
//        return i==j;
//    }