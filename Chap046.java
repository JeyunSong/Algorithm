import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chap046 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String X, String Y) {
                ArrayList<String> list = new ArrayList<>();
                StringBuilder answer = new StringBuilder();

                for (int i = 0; i <= 9; i++) {
                    String num = String.valueOf(i);

                    if (X.contains(num) && Y.contains(num)) {

                        int x = X.length() - X.replace(num, "").length();
                        int y = Y.length() - Y.replace(num, "").length();

                        int min = Math.min(x, y);

                        for (int j = 0; j < min; j++) {
                            list.add(num);
                        }
                    }
                }

                list.sort(Collections.reverseOrder());

                for (String s1 : list) {
                    answer.append(s1);
                }

                if (answer.length() == 0) {
                    return "-1";
                }else if (answer.charAt(0) == '0') {
                    return "0";
                }

                return answer.toString();
            }
        }
    }
}
