public class Chap009 {
    public static void main(String[] args) {

        class Solution {
            public long solution(long n) {
                long answer = 0;
// Math.sqrt / Math.pow 사용을 위해 double 변수 생성
                double x, y = 0;
// n의 제곱근 판별과 n의 제곱근 +1의 제곱 생성
                x = Math.sqrt(n);
                y = Math.pow(x+1, 2);
// return은 long타입으로 보내야하기 때문에 형변환
                answer = (long) y;
// 제곱근 x가 자연수면 answer 아니면 -1 리턴
                return (x == (int) x) ? answer : -1;
                }
            }
        }
    }

