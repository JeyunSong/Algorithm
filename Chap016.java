import java.util.ArrayList;
import java.util.Arrays;

public class Chap016 {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] numbers) {
                int[] answer = {};
                int num = 0;
                int sum = 0;
                ArrayList<Integer> array = new ArrayList<Integer>();

                for (int i = 0; i< numbers.length-1; i++) {
                    for (int j=i+1; j<numbers.length; j++) {
                        sum = numbers[i] + numbers[j];
                        if(!array.contains(sum)) array.add(sum);
                    }
                }
                answer = new int[array.size()];
                for (int k = 0; k<answer.length; k++) answer[k] = array.get(k);

                Arrays.sort(answer);
                return answer;
            }
        }

    }
}
