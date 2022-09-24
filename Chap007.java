
import java.util.Arrays;
public class Chap007 {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(long n) {
                int [] answer = {};
// long n 값을 String로 바꿔주기
                String s = String.valueOf(n);
// String 값에 reverse 메서트를 사용하기 위해 StringBuilder 객체 생성
                StringBuilder str = new StringBuilder(s);
// reverse
                str = str.reverse();
// str 값을 배열로 변경
// (StringBuilder 클래스에서는 .split을 사용할 수 없기 때문에 .toString으로 변경)
                String [] array = str.toString().split("");

// String 배열을 int 배열로 컨버트
                answer = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
                return answer;
            }
        }
    }
}
