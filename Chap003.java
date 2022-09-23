public class Chap003 {
    public static void main(String[] args) {

        class Solution {
            public String solution(int n) {
                String watermelon = "수박";
                String answer = (n % 2==0) ? watermelon.repeat(n / 2) : watermelon.repeat(n / 2) + "수";
                return answer;

            }
        }
    }
}