import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
// commands 열의 길이의 int 배열 생성
        int[] answer = new int[commands.length];

        for (int k = 0; k < commands.length; k++) {
// Arrays.copyOfRange를 활용하여 배열을 잘라준다.
            int[] out = Arrays.copyOfRange(array, commands[k][0] - 1, commands[k][1]);
// 정렬
            Arrays.sort(out);
// k번째 수 배열에 추가
            answer[k] = out[commands[k][2] - 1];
        }
        return answer;
    }
}

