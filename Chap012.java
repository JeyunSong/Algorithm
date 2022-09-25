import java.util.Arrays;

public class Chap012 {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(int x) {
                int num = 0;
// int x를 String 배열로 바꾸기
                String s = String.valueOf(x);
                String[] array = s.split("");
// num 값에 array 배열 int 값으로 변환 후 모두 더해주기
                for (String k : array) num += Integer.parseInt(k);
// x가 num으로 나눠지면 true 나누어지지 않으면 false 리턴
                return x % num == 0;
            }
        }
    }
}