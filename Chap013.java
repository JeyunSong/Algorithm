public class Chap013 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int n) {
                int answer = 0;
                String s,t = "";
// Integer.toString(n, radix i)를 사용하면 i진수 문자열로 컨버트 가능
                s = Integer.toString(n, 3);
// StringBuilder 클래스를 사용하여 리버스
                StringBuilder x = new StringBuilder(s);
                x.reverse();
// 다시 10진법으로 표현하기 위해선 x를 string 값으로 변환해야한다.
                t = x.toString();
// Integer.parseInt(t, radix i) i진법 t를 10진법으로 변환해주는 메소드
                answer = Integer.parseInt(t,3);

                return answer;
            }
        }
        // 진법변환


    }
}
