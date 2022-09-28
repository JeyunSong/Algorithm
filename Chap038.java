
import java.util.ArrayList;
import java.util.Collections;

public class Chap038 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {

// String s 리스트에 담아주기
// String s ▶ String[] strings ▶ ArrayList<Integer> array
                ArrayList<Integer> array = new ArrayList<>();
                String[] strings = s.split(" ");
                for (String string : strings) array.add(Integer.parseInt(string));
// 리스트에서 가장 작은 값과 큰 값 사이에 공백을 더해 리턴
                return Collections.min(array) + " " + Collections.max(array);
            }
        }


    }
}
