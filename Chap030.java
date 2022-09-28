public class Chap030 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
// i로 나누어질 때 1이 남는 숫자가 나오면 break
                for (int i = 2; i < n; i++)
                    if (n % i == 1) {
                        answer = i;
                        break;
                    }
                return answer;
            }
        }



    }
}
