public class Chap022 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                String [] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                String [] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
// 0~9까지 대응되는 영어가 있으면 숫자로 replace
                for (int i=0; i<10; i++){
                    s = s.replace(eng[i], num[i]);
                }
// int 형태로 변환
                return Integer.parseInt(s);
            }
        }

    }
}
