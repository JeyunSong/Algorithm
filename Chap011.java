public class Chap011 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num) {
                int count = 0;

                while (num != 1){
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