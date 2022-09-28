

public class Chap035 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(int n, int[] arr1, int[] arr2) {
// 2진수에서 겹치는 부분을 담을 n 길이의 String 배열 생성
                String[] answer = new String[n];

// 2진수로 형변환 후 비트연산자 or을 사용하여 둘 중 하나만 '1'이라도 '1'추가
                for (int i = 0; i < n; i++) {
                    answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
                }

                for (int i = 0; i < answer.length; i++) {

// 만약 문자열 가장 앞 자리에서 겹친 부분이 0이었다면 n의 길이와 같아지도록 공백 추가
// 2진수 문자열 가장 앞 자리에 0이 오면 생략된다.
                    if (answer[i].length() < n) {
                        for (int y = answer[i].length(); y < n; y++) {
                            answer[i] = " " + answer[i];
                        }
                    }
// '1'은 '#'으로 '0'은 공백으로 replaceAll
                    answer[i] = answer[i].replaceAll("1", "#");
                    answer[i] = answer[i].replaceAll("0", " ");
                }
                return answer;
            }
        }


    }
}



