import java.util.ArrayList;

public class Chap017 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int count = 0;
                int zero = 0;

                ArrayList<Integer> array = new ArrayList<Integer>();

                for (int k : lottos) {
                    array.add(k);
                    if (k == 0) zero++;
                }

                for (int win_num : win_nums) {
                    if (array.contains(win_num)) count++;
                }
                if (zero == 6) return new int[]{1,6};
                if (count == 0 && zero ==0) return new int[]{6, 6};

                int max = count + zero;
                int min = count;


                return new int[]{7 - max, 7 - min};
            }
        }

    }
}
