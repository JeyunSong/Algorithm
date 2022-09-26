import java.util.Arrays;

class Chap029 {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int k=0; k<commands.length; k++) {
            int[] out = Arrays.copyOfRange(array, commands[k][0] - 1, commands[k][1]);
            Arrays.sort(out);
            answer[k] = out[commands[k][2] - 1];
        }
        return answer;
    }
}

