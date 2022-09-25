import java.util.ArrayList;

public class Chap015 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                int[] answer = {};
// 동적 할당을 위해 ArrayList 생성
                ArrayList<Integer> array = new ArrayList<Integer>();

                int num = 999;
// arr[k]가 num과 다르다면 array에 추가, 이후 같은 숫자는 추가 안함
                for (int k : arr)
                    if (k != num) {
                        array.add(k);
                        num = k;
                    }
// array를 int배열로 변환
                answer = new int[array.size()];
                for (int i = 0; i < answer.length; i++) answer[i] = array.get(i);

                return answer;

            }
        }

    }
}
