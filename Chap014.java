
public class Chap014 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int maxx = 0;
                int miny = 0;
// sizes 2차원배열을 for문을 통해 세로와 가로를 바꿔서 계산
                for (int[] array : sizes) {
// [i][0]과 [i][1] 중 더 큰 값은 max에 작은 값은 min에 저장
                    int max = Math.max(array[0], array[1]);
                    int min = Math.min(array[0], array[1]);
// max 중 가장 큰 값을 maxx에 저장 / min 중 가장 큰 값을 miny에 저장
                    if (maxx < max) maxx = max;
                    if (miny < min) miny = min;
                }
// maxx * miny 는 지갑의 최소 넓이
                return maxx*miny;
            }
        }
    }
}
