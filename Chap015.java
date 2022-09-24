import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Chap015 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                int[] answer = {};
                ArrayList<Integer> array = new ArrayList<Integer>();

                int num = 999;
                for (int k : arr)
                    if (k != num) {
                        array.add(k);
                        num = k;
                    }
                answer = new int[array.size()];
                for (int i = 0; i < answer.length; i++) answer[i] = array.get(i);

                return answer;

            }
        }

    }
}
