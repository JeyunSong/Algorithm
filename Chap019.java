import java.util.ArrayList;
import java.util.Collections;

public class Chap019 {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String[] strings, int n) {
                String[] answer = {};
// 동적 할당을 위한 리스트 생성
                ArrayList<String> array = new ArrayList<>();

// 앞 글자에 n번째 글자를 추가한 단어 리스트에 추가
                for (int i=0; i<strings.length; i++){
                    array.add(strings[i].charAt(n) + strings[i]);
                }
// 오름차순 정렬
                Collections.sort(array);
// 첫 번째 값을 제외한 값 int 배열에 추가
                answer = new String[array.size()];
                for (int k = 0; k<answer.length; k++) {
                    answer[k] = array.get(k).substring(1, array.get(k).length());
                }
                return answer;
            }
        }



    }
}
