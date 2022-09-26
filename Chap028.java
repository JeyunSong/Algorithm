import java.util.ArrayList;

public class Chap028 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, int m) {
                int[] answer = {};
                int MAX = 0;

                int min = Math.min(n, m);
                for (int i=1; i<=min; i++)
                    if (n%i==0 && m%i==0) MAX = i;

                int MIN = n*m/MAX;

                return new int[]{MAX, MIN};
            }
        }

    }
}

