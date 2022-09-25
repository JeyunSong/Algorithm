import java.util.ArrayList;

public class Chap018 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] answers) {

// 수포자들의 찍는 패턴 배열화
                int[] first = {1, 2, 3, 4, 5};
                int count1 = 0;

                int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
                int count2 = 0;

                int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
                int count3 = 0;

// 문제의 정답과 찍은 문제가 일치할 때 마다 카운트 증가
                for (int i = 0; i < answers.length; i++) {
                    if (answers[i] == first[i % 5]) count1++;
                    if (answers[i] == second[i % 8]) count2++;
                    if (answers[i] == third[i % 10]) count3++;
                }
// 가장 많은 카운트를 = max
                int max = Math.max(Math.max(count1, count2), count3);

// 동적 할당을 위한 리스트 생성
                ArrayList<Integer> array = new ArrayList<Integer>();
// max 카운트와 count의 값이 일치하다면 리스트에 추가
                if (max == count1) array.add(1);
                if (max == count2) array.add(2);
                if (max == count3) array.add(3);

// 리스트를 int 배열로 컨버트
                answers = new int[array.size()];
                for (int k = 0; k < answers.length; k++) {
                    answers[k] = array.get(k);
                }

                return answers;


            }
        }

    }
}
