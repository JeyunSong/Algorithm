import java.util.ArrayList;

public class Chap017 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int count = 0;
                int zero = 0;
// 동적 할당을 위한 리스트 생성
                ArrayList<Integer> array = new ArrayList<Integer>();
// lottos[]의 값을 리스트에 추가, 만약 0이 있다면 zero++
                for (int k : lottos) {
                    array.add(k);
                    if (k == 0) zero++;
                }

// 리스트에 당첨번호가 포함되어 있다면 count++
                for (int win_num : win_nums) {
                    if (array.contains(win_num)) count++;
                }
// 예외사항 if문으로 해결
                if (zero == 6) return new int[]{1,6};
                if (count == 0 && zero ==0) return new int[]{6, 6};
// 최대 기댓값은 count + zero, 최소 기댓값은 count
                int max = count + zero;
                int min = count;

// 등수 리턴 (6개 맞추면 1등, 5개 맞추면 2등 ...)
                return new int[]{7 - max, 7 - min};
            }
        }

    }
}
