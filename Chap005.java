public class Chap005 {
    public static void main(String[] args) {

        class Solution {
            public String solution(String s) {
                String answer = "";
                int count = 0;
// String S를 배열로 바꾸기 (공백도 같이 출력해야하니 .split(""))
                String[] str = s.split("");
// word 값이 공백이면 count +0 아니면 +1
                for (String word : str) {
                    count = (word.equals(" ")) ? 0 : count+1;
// count%2==1 로 짝수 문자 대문자 홀수 문자 소문자 출력
                    answer = (count%2==1) ? word.toUpperCase() : word.toLowerCase();
                }
                return answer;
            }
        }
    }
}

