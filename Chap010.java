public class Chap010 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
// arr배열의 길이가 1이라면 -1 리턴
                if (arr.length == 1) return new int[]{-1};
// arr은 길이 1 이상인 배열이니 관련 없는 숫자 num 지정
                int num = 99999;
// for문으로 가장 작은 arr[i] 값 찾기
                for (int i : arr) {
                    if (num > i) num = i;
                }

// 가장 작은 값을 뺀 길이의 배열 객체 생성
                int[] array = new int[arr.length-1];
// array에 추가할 매개변수 초기화
                int x = 0;
// array에 num이 아닌 arr[j] 추가
                for (int j : arr) {
                    if (num!=j) array[x++] = j;
                }
                return array;
            }
        }
    }
}