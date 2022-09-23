
import java.util.stream.Stream;

public class Chap007 {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(long n) {
// long a 를 String 개별 값으로 변환
                int[] answer = Stream.of(String.valueOf(n).split(""))
// int 값으로 맵 지정 후 배열
                        .mapToInt(Integer::parseInt)
                        .toArray();

// int[] 배열 역순으로 변환 (두 물컵에 있는 액체를 서로의 컵으로 옮기려면 새로운 컵 하나가 필요하다.)
                int temp;

                for (int i = 0; i < answer.length / 2; i++) {
                    temp = answer[i];
                    answer[i] = answer[(answer.length - 1) - i];
                    answer[(answer.length - 1) - i] = temp;
                }
                return answer;
            }


        }
    }
}
