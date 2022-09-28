public class Chap036 {
    public static void main(String[] args) {
        class Solution {
            public String solution(int[] numbers, String hand) {
                String answer = "";

// 키패드 * = 10, 0 = 11, # = 12 로 생각하고 시작한다.
// 왼손은 10 오른손은 12에 있는 상황
                int left = 10;
                int right = 12;

// 손가락을 움직일 때 마다 left / right 값을 해당 지점 값으로 바꿔준다.
// 1,4,7이면 무조건 "L" / 3,6,9면 무조건 "R" 저장
                for (int k : numbers) {
                    if (k == 1 || k == 4 || k == 7) {
                        answer += "L";
                        left = k;
                    } else if (k == 3 || k == 6 || k == 9) {
                        answer += "R";
                        right = k;
// k가 0이면 11로 변경
                    } else {
                        if (k == 0) k += 11;
// numbers[k]까지 왼손 오른손 이동거리 계산
                        int leftindex = (Math.abs(k - left)) / 3 + (Math.abs(k - left)) % 3;
                        int rightindex = (Math.abs(k - right)) / 3 + (Math.abs(k - right)) % 3;
// 만약 이동거리가 같다면 hand에 따라 값 출력
                        if (leftindex == rightindex) {
                            if (hand.equals("right")) {
                                answer += "R";
                                right = k;
                            } else {
                                answer += "L";
                                left = k;
                            }
// 왼손 이동거리가 짧으면 "L" 오른손 거리가 짧으면 "R" 추가
                        } else if (leftindex > rightindex) {
                            answer += "R";
                            right = k;
                        } else {
                            answer += "L";
                            left = k;
                        }
                    }
                }

                return answer;
            }
        }

    }
}
