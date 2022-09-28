import java.util.ArrayList;

class Scratch002 { //Chap021 소수 구하기
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        ArrayList<Integer> array = new ArrayList<Integer>();
// 3중 for문으로 3개의 수를 더하기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (!array.contains(sum)) array.add(sum);
// sum이 true면 answer++
                }
            }
        }
        for (int y = 2; y < sum; y++) {
            if (sum % y != 0) answer++;
        }
        return answer;
    }
}
// 틀린 코드인데 계속 츄라이 해보기

