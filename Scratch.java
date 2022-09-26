import java.util.ArrayList;

public class Scratch {
    public static void main(String[] args) {
        class Solution { //Chap023 문자열 밀기
            public String solution(String s, int n) {
                String answer = "";
                String [] alpa = {"a", "b", "c", "d", "e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
                String [] ALPA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

                String[] array = s.split("");

                for (int i=0; i<array.length; i++) {
                    array[i] = array[i].replace(alpa[i], alpa[(i+n)%alpa.length]);
                    array[i] = array[i].replace(ALPA[i], ALPA[(i+n)%ALPA.length]);
                }

                for (int k=0; k< array.length; k++) {
                    answer += array[k];
                }
                return answer;
            }
        }

    }
}

class Scratch2 { //Chap021 소수 구하기
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

