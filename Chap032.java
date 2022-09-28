import java.util.ArrayList;
import java.util.Collections;


class Chap032 {
    public int[] solution(int N, int[] stages) {
        double count = 0;
        int num = 0;
        double people = stages.length;
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Double> array = new ArrayList<Double>();
        ArrayList<Double> array3 = new ArrayList<Double>();

        for (int i = 1; i <= N; i++) {
            people -= count;
            count = 0;

            if (people == 0 && count == 0) {
                array.add(0.0);
                array3.add(0.0);
                break;
            }

            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }

            }

            array.add(count / people);
            array3.add(count / people);
        }

        System.out.println(array3);

        array.sort(Collections.reverseOrder());
        System.out.println(array);

        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (array.get(k).equals(array3.get(j))) {
                    if (array2.contains(j + 1)) {
                        array2.add(j + 2);
                    } else array2.add(j + 1);

                    array3.set(j, (double) -99);
                    break;
                }
            }
        }

        int[] answer = new int[array2.size()];
        for (int m=0; m<answer.length; m++)
            answer[m] = array2.get(m);

        return answer;
    }
}

