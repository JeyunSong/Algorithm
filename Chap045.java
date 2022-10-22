import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chap045 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String X, String Y) {
                StringBuilder a = new StringBuilder();
                ArrayList<String> list1 = new ArrayList<>(Arrays.asList(X.split("")));
                ArrayList<String> list2 = new ArrayList<>(Arrays.asList(Y.split("")));

                list1.retainAll(list2);
                System.out.println(list1);
                list2.retainAll(list1);
                System.out.println(list2);

                list1.sort(Collections.reverseOrder());
                list2.sort(Collections.reverseOrder());


                if (list1.size() > list2.size()) {
                    for (String s1 : list2) {
                        a.append(s1);
                    }
                } else {
                    for (String s2 : list1) {
                        a.append(s2);
                    }
                }

                if (a.length() == 0) return "-1";
                else if (a.charAt(0) == '0') return "0";

                return a.toString();
            }
        }
    }
}
