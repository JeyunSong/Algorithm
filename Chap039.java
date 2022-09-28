public class Chap039 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
//  n 이전의 연속된 숫자들의 합으로 구하기
// 이중 for문을 사용해 i=1부터 시작
                for (int i=1; i<=n; i++){
                    int num = 0;
// 차례대로 더해 n과 일치해지면 answer++ break
                        for (int k=i; k<=n; k++){
                            num += k;
                            if (num == n){
                                answer++;
                                break;
// 효율성을 위해 n보다 숫자가 커지면 break
                            } else if (num > n) break;
                        }
                    }
                return answer;
            }
        }

    }
}
