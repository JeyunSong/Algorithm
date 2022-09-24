public class Chap013 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int n) {
                int answer = 0;
                String s,t = "";

                s = Integer.toString(n, 3);

                StringBuilder x = new StringBuilder(s);
                x.reverse();

                t = x.toString();
                answer = Integer.parseInt(t,3);

                return answer;
            }
        }
        // 진법변환


    }
}
