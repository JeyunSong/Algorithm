import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test003 {
    public static String[] solution(String[] arr, int n) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> trash = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        Arrays.sort(arr);

        String ex = "999";

        for (String s : arr) {
            if (!s.equals(ex)) {
                list.add(s);
                ex = s;
            }else trash.add(s);
        }

        list.removeAll(trash);

        for (String s : list) result.add(s.charAt(n) + s);

        Collections.sort(result);

        String[] answer = new String[result.size()];
        for (int x=0; x< result.size(); x++)
            answer[x] = result.get(x).substring(1, result.get(x).length());


        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"coke", "water", "glass", "dog", "dog", "vitamin"};
        int n = 2;
        System.out.println(Arrays.toString(solution(arr, n)));
    }
}
