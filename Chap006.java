public class Chap006 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int n) {
                int answer = 0;
// int n을 String 배열로 변환
                String str = Integer.toString(n);
                String [] array = str.split("");
// Array[] 반복문 실행 후 값 하나하나 int 값으로 변환 후 answer에 저장
                for (String s : array) {
                    answer += Integer.parseInt(s);
                }
                return answer;
            }
        }
    }
}
