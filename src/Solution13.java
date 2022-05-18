public class Solution13 {
    public String solution(int a, int b) {
        String answer = "";
        // 1. 그날이 이번해의 몇번째 날짜인지 확인
        // 2. 홀수 월과 짝수 월의 규칙성이 존재
        // 3. 단, 2월의 일수는 예외성이 있으며, 8월을 기준으로 규칙이 변경
        int totalDays = 0;
        // 전체 일수 산출
        if(a==1){ // 전월이 없는 1월 사전 처리
            totalDays += b;
        } else {

            for(int lastMonth = 1; lastMonth < a ; lastMonth++){
                // 2월 예외 처리
                if(lastMonth == 2){
                    totalDays += 29;
                    continue;
                }
                // 8월 기준 규칙 변경
                if(lastMonth < 8){
                    totalDays += lastMonth%2==1?31:30;
                } else {
                    totalDays += lastMonth%2==0?31:30;
                }
            }
            totalDays += b;
        }

        // 요일 판별
        switch  (totalDays % 7){
            case 0: answer = "THU"; break;
            case 1: answer = "FRI"; break;
            case 2: answer = "SAT"; break;
            case 3: answer = "SUN"; break;
            case 4: answer = "MON"; break;
            case 5: answer = "TUE"; break;
            default: answer = "WED"; break;
        }
        return answer;
    }

    // 요일 판별
    //    String[] today = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    //    return today[totalDays%7];
}

//import java.time.DayOfWeek;
//        import java.time.LocalDate;
//
//class Solution {
//    public String solution(int a, int b) {
//
//        LocalDate date = LocalDate.of(2016, a, b); // 날짜를 나타내는 class
//        DayOfWeek dayOfWeek = date.getDayOfWeek(); // 요일을 나타내는 Enum : "MONDAY"와 같이 반환
//
//        return dayOfWeek.toString().substring(0, 3);
//    }
//}