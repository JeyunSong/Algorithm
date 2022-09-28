public class Chap026 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int count = 0;
// 1부터 n/2까지 나누어지는 값 더하기
                for (int i=1; i<=n/2; i++)
                    if (n%i==0) answer += i;
// 본인까지 더해서 return
                return answer+n;
            }
        }
    }
}