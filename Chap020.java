import java.util.Arrays;
import java.util.Collections;

public class Chap020 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
// String s의 문자열 역순 배열화
// 대문자와 소문자를 같은 것으로 간주한다면
// Collections.sort(array, Collections.reversOrder(String.CASE_INSENSITIVE_ORDER));
                String [] array = s.split("");
                Arrays.sort(array, Collections.reverseOrder());
// 문자열로 변환
                for (String k : array) {
                    answer += k;
                }
                return answer;
            }
        }

    }
}
