// Arrays.sort() 메소드를 사용하기 위해 java.util 패키지 import

import java.util.Arrays;

public class Chap004 {
    public static void main(String[] args) {


        class Solution {
            public String solution(String[] participant, String[] completion) {
                String answer = "";
// Arrays.sort()로 오름차순 나열
                Arrays.sort(participant);
                Arrays.sort(completion);

// 완주자가 참가자보다 1명 많다는 것은 동일하게 나열 후 대조하면 participant에서 나온 다른 값이 미완주자
// 참가자 n명과 완주자 n-1명을 대조 후 동일하지 않은 값 answer 할당
                for (int i = 0; i < completion.length; i++) {
                    if (!(participant[i].equals(completion[i]))) {
                        answer = participant[i];
                        break;
                    }
// 만약 i값을 completion.length까지 반복했음에도 상이한 값이 나오지 않으면 participant[i + 1]이 미완주자
                    if (i == completion.length - 1) answer = participant[i + 1];
                }
                return answer;
            }
        }
    }
}




