

public class Chap037 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String dartResult) {

// array의 인덱스를 지정하기 위한 count와 3크기의 array 생성
                int count = -1;
                int[] array = new int[3];

// dartResult를 char 배열로 바꿔주기
                char[] index = dartResult.toCharArray();

// for문을 활용하여 단어 하나하나 수식으로 변경
                for (int i = 0; i < index.length; i++)

// index[i]가 숫자면 array에 추가 (count로 현재 array 값 구분)
// 만약 숫자가 10이라면 (index[i] == 1 , index[i+1] == 0)
// 추가했던 수 제거 후 다시 10 삽입 + i값에 1 추가
                    if ('0' <= index[i] && index[i] <= '9') {
                        count++;
                        array[count] += Integer.parseInt(String.valueOf(index[i]));
                        if (index[i] == 1 && index[i + 1] == 0) {
                            array[count] -= Integer.parseInt(String.valueOf(index[i]));
                            array[count] = 10;
                            i++;
                        }
// D or T가 나오면 array[count]에 적용
                    } else if (index[i] == 'D') {
                        array[count] *= array[count];
                    } else if (index[i] == 'T') {
                        array[count] *= array[count] * array[count];

// "*"이 나왔을 경우에 count가 0이 아니라면 array[count-1]에도 *2 적용
// count가 0이라면 자신의 숫자에만 적용
                    } else if (index[i] == '*') {
                        if (count != 0) {
                            array[count] *= 2;
                            array[count - 1] *= 2;
                        } else array[count] *= 2;

// "#"이 나오면 자신의 숫자에 *-1 적용
                    } else if (index[i] == '#') {
                        array[count] *= -1;
                    }

// 세 수를 더한 값 리턴
                return array[0] + array[1] + array[2];
            }
        }
    }
}
