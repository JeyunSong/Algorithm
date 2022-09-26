public class Chap026 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int count = 0;

                for (int i=1; i<=n/2; i++)
                    if (n%i==0) answer += i;

                return answer+n;
            }
        }

    }
}