import java.util.Arrays;

public class Chap012 {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(int x) {
                int has = 0;
                String s = String.valueOf(x);
                String [] array = s.split("");
                int [] num = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

                for (int i : num) has += i;
                if ( x % has == 0) return true;
                else return false;
            }
        }
    } // return x%has == 0
    // for문 안에서 int로 변환
    // String i로 해서 parsrInt
}
// 기존에 배웠던거 응용