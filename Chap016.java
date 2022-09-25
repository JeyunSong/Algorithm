import java.util.ArrayList;
import java.util.Arrays;

public class Chap016 {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] numbers) {
                int[] answer = {};
                int num = 0;
                int sum = 0;
// 동적 할당을 위한 ArrayList 생성
                ArrayList<Integer> array = new ArrayList<Integer>();
// for문을 활용해 두 수의 덧셈 반복 실행 ( i<number.length -1 ) 마지막 숫자는 체크 할 필요가 없으니 생략
                for (int i = 0; i< numbers.length-1; i++) {
                    for (int j=i+1; j<numbers.length; j++) {
                        sum = numbers[i] + numbers[j];
// 중복된 숫자가 없을 때 리스트에 추가
                        if(!array.contains(sum)) array.add(sum);
                    }
                }
// 리스트 int 배열로 컨버트
                answer = new int[array.size()];
                for (int k = 0; k<answer.length; k++) answer[k] = array.get(k);
// 오름차순 정렬
                Arrays.sort(answer);
                return answer;
            }
        }

    }
}
