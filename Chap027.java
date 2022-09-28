import java.util.Arrays;
class Chap027 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
// int[] d 오름차순 정렬
        Arrays.sort(d);

// j를 budget이 0이 될 때 까지 빼주기
        for (int j : d) {
            budget -= j;
            if (budget < 0) break;
            answer++;
            }
        return answer;
    }
}

