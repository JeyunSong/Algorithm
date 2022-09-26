import java.util.ArrayList;


        class Solution {
            public int[] solution(int N, int[] stages) {
                int[] answer = {};
                double count = 0;
                int num = 0;
                double people = stages.length;

                ArrayList<Integer> a = new ArrayList<Integer>();
                for(int i = 1; i <= N; i++) a.add(i);

                ArrayList<Double> array = new ArrayList<Double>();

                for (int i=1; i<=N; i++) {
                    people -= count;
                    count = 0;
                    for (int k = 0; k < stages.length; k++) {
                        if (stages[k] == i) {
                            count++;
                        }
                    } array.add(count/people);
                }

                System.out.println(array);




                return answer;
            }
        }

