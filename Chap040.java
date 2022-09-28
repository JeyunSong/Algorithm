import java.util.ArrayList;

public class Chap040 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] board, int[] moves) {
                int answer = 0;
// 바구니의 역할을 하는 list 생성
                ArrayList<Integer> list = new ArrayList<>();
// moves[0]부터 출력
                for (int move : moves) {
// h는 크레인이 들어가는 보드의 길이
// 크레인이 잡은 수가 0이 아닐 때 리스트에 값 추가
                    for (int h = 0; h < board.length; h++) {
                        if (board[h][move - 1] > 0) {
                            list.add(board[h][move - 1]);
// 리스트에 추가된 수는 0으로 변경
                            board[h][move - 1] = 0;
                            break;
                        }
                    }
                }
                    int count = 0;
// 겹치는 부분 제거하기
                    for (int z = 0; z < list.size(); z++) {
// 현재 list의 인덱스가 마지막이 아닐 때, 현재 수와 다음 수가 같으면 제거
                        if (z != (list.size() - 1)) {
                            if (list.get(z) == list.get(z + 1)) {
                                count += 2;
                                list.remove(z+1);
                                list.remove(z);
// 다시 처음으로 돌아가기 위해 z = -1로 설정
// ( for문으로 돌아가면 바로 z++이 되어 0으로 변함 )
                                z=-1;
                            }
                        }
                    }
                    return count;
                }
            }


    }
}
