
public class Chap001 {
    public static void main(String[] args) {

        class Solution {
            public String solution(int a, int b) {

// 요일과 월의 배열 지정 ( 2016/1/1 = FRI )
                String[] WeekDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WEN", "THU"};
                int[] lastDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

// a월 이전까지의 일 수 구하기
                int day = 0;
                for (int i = 0; i < a - 1; i++) {
                    day += lastDay[i];
                }
// a월의 b일까지 추가 ( 1일부터 카운트 시작하니 -1 )
                day += b - 1;

// 총 날짜에서 7 나누며 요일 출력
                return WeekDay[day % 7];
            }
        }

    }
}


