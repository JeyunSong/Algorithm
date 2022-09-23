import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chap008 {
    public static void main(String[] args) {

        class Solution {
            public long solution(long n) {
                String s = String.valueOf(n);
                String [] array = s.split("");
                Arrays.sort(array);
                List<String> list = Arrays.asList(array);
                Collections.reverse(list);

                ArrayList.toLong();

            }
        }
    }
}
