

public class Chap043 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String phone_number) {
                StringBuilder result = new StringBuilder();
                String answer = phone_number.substring(phone_number.length()-4);
                for (int k=0; k<phone_number.length()-4; k++) result.append("*");
                result.append(answer);
                return result.toString();
            }
        }
    }
}


