
public class Chap024 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String new_id) {
// STEP 1. 소문자 변환
                String answer = new_id.toLowerCase();
// STEP 2. -_.를 제외한 특수문자 제거 (정규표현식 사용)
                answer = answer.replaceAll("[^a-z0-9-_.]", "");
// STEP 3. 2번 이상 .이 반복하면 . 1개로 변경
                answer = answer.replaceAll("[.]{2,}", ".");
// STEP 4. 앞과 끝에 .이 있으면 삭제
                answer = answer.replaceAll("^[.]|[.]$", "");
// STEP 5. 문자열이 공백이면 a로 변경
                if (answer.equals("")) answer = "a";
// STEP 6. 문자열이 16자 이상이면 15자까지 출력, 만약 마지막이 .이면 삭제
                if (answer.length() >= 16) {
                    answer = answer.substring(0,15);
                    answer = answer.replaceAll("[.]$", "");
                }
// STEP 7. 문자열이 3글자 미만이면 3글자가 될 때 까지 마지막 문자 추가
                StringBuilder num = new StringBuilder(answer);
                while (num.length() < 3) num.append(num.charAt(num.length()-1));
// StringBuilder String으로 바꿔 return
                return num.toString();
            }
        }
    }
}