import java.util.Arrays;
class Chap033 {
    public int solution(int n, int[] lost, int[] reserve) {
// 현재 체육수업을 들을 수 있는 학생은 전체 학생 - 잃어버린 학생
        int answer = n - lost.length;

// lost와 reserve를 오름차순으로 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
// 잃어버린 학생과 여벌을 챙겨온 학생이 일치하다면 answer++
// 영향을 줄 수 없게 둘 다 -999로 설정
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -999;
                    break;
                }
            }
        }
// 여벌이 있는 학생 +-1에 잃어버린 학생이 있다면 answer++
// 여벌이 있는 학생은 -999로 영향을 줄 수 없게 처리
        for (int Lost : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == Lost + 1 || reserve[i] == Lost - 1) {
                    answer++;
                    reserve[i] = -999;
                    break;
                }
            }
        }
        return answer;
    }
}
