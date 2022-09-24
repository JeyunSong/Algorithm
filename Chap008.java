import java.util.Arrays;
import java.util.Collections;

public class Chap008 {
    public static void main(String[] args) {

        class Solution {
            public long solution(long n) {
                long answer = 0;
// long n을 String.valueOF을 사용허여 String 값으로 변경
                String s = String.valueOf(n);
// String s를 배열화
                String [] array = s.split("");
// array[] 역순 나열 (Collections.reversOrder()을 사용하면 가능)
                Arrays.sort(array, Collections.reverseOrder());

                String num = "";
// String num 값을 지정하고 배열에서 옮기기
                for(String i : array) num += i;
// 마지막 num 값을 Long 타입으로 변환
                answer = Long.parseLong(num);

                return answer;

            }
        }
    }
}
