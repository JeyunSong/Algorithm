
public class Chap028 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, int m) {
                int[] answer = {};
                int MAX = 0;
// 더 작은 수 = min
                int min = Math.min(n, m);
// 1부터 min까지의 수 중에서 가장 큰 값으로 나누어지는 수 = 최대공약수
                for (int i=1; i<=min; i++)
                    if (n%i==0 && m%i==0) MAX = i;
// 최소공배수 = n*m/MAX
                int MIN = n*m/MAX;

                return new int[]{MAX, MIN};
            }
        }

    }
}

