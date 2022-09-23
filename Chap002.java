import java.util.ArrayList;
import java.util.Collections;

public class Chap002 {
    public static void main(String[] args) {
// Arrays.sort() 메소드를 사용하기 위해 java.util 패키지 import


//동적인 결과물을 반환하기 위해 ArrayList 클래스 사용
        class Solution {
            public ArrayList<Integer> solution(int[] arr, int divisor) {
//ArrayList 객체 생성
                ArrayList<Integer> x = new ArrayList<Integer>();
//arr 배열과 divisor의 나머지 값이 0인 경우 ArrayList 객체에 추가
                for (int j : arr) {
                    if (j % divisor == 0) x.add(j);
                }
//반복문 이후 객체 요소가 비어있다면 -1 추가
                if (x.isEmpty()) x.add(1);
// 오름차순 정렬 (ArrayList 클래스에선 Collections.sort // Arrays.sort 사용 불가)
                Collections.sort(x);
                return x;

            }
        }

    }
}
