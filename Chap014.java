import java.util.Arrays;
import java.util.Comparator;

public class Chap014 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int maxx = 0;
                int miny = 0;

                for (int [] array : sizes) {
                    int max = Math.max(array[0], array[1]);
                    int min = Math.min(array[0], array[1]);

                    if (maxx < max) maxx = max;
                    if (miny < min) miny = min;
                }
                return maxx*miny;
            }
        }
    }
}
