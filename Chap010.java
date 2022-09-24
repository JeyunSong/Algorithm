import java.util.Arrays;

public class Chap010 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {

                if (arr.length == 1) return new int[]{-1};

                int[] answer = {};

                int num = 99999;
                for (int i : arr) {
                    if (num > i) num = i;
                }

                int[] array = new int[arr.length-1];
                int x = 0;
                for (int j : arr) {
                    if (num!=j) array[x++] = j;
                }
                return array;
            }
        }
    }
} // 배열에서 가장 작은 수 판별 + 배열에 추가