
import java.util.Arrays;

public class Chap034 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] nums) {
                int answer = 0;
                int num = 999;
//폰켓몬 오름차순으로 정리
                Arrays.sort(nums);
// 겹치는 수 제거
                for (int k=0; k<nums.length; k++)
                    if (nums[k] != num) {
                        answer++;
                        num = nums[k];
                    }
// 만약 answer가 전체 폰켓몬 수의 절반을 넘는다면 nums.length/2로 설정
                if (answer > nums.length/2)
                    answer = nums.length/2;

                return answer;
            }
        }

    }
}
