public class Chap023 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                String answer = "";

// charAt() 메소드로 글자 하나하나 테스트
                for (int i=0; i<s.length(); i++) {
                    char ch = s.charAt(i);
// 아스키코드를 활용해 +n번째 문자를 추출
// (z에서 a로 루프를 돌리기 위해 나머지 연산자 사용)
                    if (Character.isLowerCase(ch)) {
                        ch = (char)((ch-'a'+n)%26+ 'a');
                    }
                    else if (Character.isUpperCase(ch)) {
                        ch = (char)((ch-'A'+n)%26+ 'A');
                    }
// 문자가 공백일 시 자동으로 answer에 추가
                    answer += ch;
                }
                return answer;
            }
        }

    }
}
