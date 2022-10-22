import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Chap044 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        for (String m : id_list) {
            HashSet<String> count = map.get(m);
            if (count.size() >= k) {
                for (String name : count) {
                    answer[idxMap.get(name)]++;
                    System.out.println(Arrays.toString(answer));
                }
            }
        }
        return answer;
    }
}