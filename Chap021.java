class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

// 3중 for문으로 3개의 수를 더하기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
// sum이 true면 answer++
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

// 소수 판별을 위해 boolean 인스턴스를 생성
    private boolean isPrime(int sum) {
// 2부터 sum까지 자연수로 나누어지지 않으면 true
        for (int y = 2; y < sum; y++) {
            if (sum % y == 0)
                return false;
        }       return true;
    }
}




