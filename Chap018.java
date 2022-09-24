import java.util.ArrayList;

public class Chap018 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] answers) {

                int[] first = {1,2,3,4,5};
                int count1 = 0;

                int[] second = {2,1,2,3,2,4,2,5};
                int count2 = 0;

                int[] third = {3,3,1,1,2,2,4,4,5,5};
                int count3 = 0;


                for (int i=0; i<answers.length; i++) {
                    if (answers[i] == first[i%5]) count1++;
                    if (answers[i] == second[i%8]) count2++;
                    if (answers[i] == third[i%10]) count3++;
                }
                int max = Math.max(Math.max(count1, count2), count3);

                ArrayList<Integer> array = new ArrayList<Integer>();
                if (max == count1) array.add(1);
                if (max == count2) array.add(2);
                if (max == count3) array.add(3);

                answers = new int[array.size()];
                for (int k = 0; k < answers.length; k++) {
                    answers[k] = array.get(k);
                }

                return answers;



            }
        }

    }
}
