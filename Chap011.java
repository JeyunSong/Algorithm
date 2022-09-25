public class Chap011 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num) {
                int count = 0;
// num이 1이 될 때 까지 반복
                while (num != 1){
// 만약 626331을 (num%2 == 0) 짝수 판별부터 시작한다면 488번 째에서 int형 오버플로우가 발생한다.
// 그렇다면 타입을 long 값으로 변환하던가 밑의 방법으로 해결한다.
                    num = ( num % 2 == 1 ) ? num*3+1 : num/2;
                    count ++;
                    if (count >= 500) return -1;
                }
                return count;
            }
        }
    }
}
// 오버플로우