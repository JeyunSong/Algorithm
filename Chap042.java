public class Chap042 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] survey, int[] choices) {
                StringBuilder answer = new StringBuilder();
                int countRT = 0;
                int countCF = 0;
                int countJM = 0;
                int countAN = 0;

                int k = 0;
                while (k < survey.length) {
                    switch (survey[k]) {
                        case "RT":
                            countRT = countRT + choices[k] - 4;
                            break;
                        case "TR":
                            countRT = countRT - choices[k] + 4;
                            break;
                        case "CF":
                            countCF = countCF + choices[k] - 4;
                            break;
                        case "FC":
                            countCF = countCF - choices[k] + 4;
                            break;
                        case "JM":
                            countJM = countJM + choices[k] - 4;
                            break;
                        case "MJ":
                            countJM = countJM - choices[k] + 4;
                            break;
                        case "AN":
                            countAN = countAN + choices[k] - 4;
                            break;
                        case "NA":
                            countAN = countAN - choices[k] + 4;
                            break;
                    }
                    k++;
                }
                System.out.println(countRT);
                System.out.println(countCF);
                System.out.println(countJM);
                System.out.println(countAN);

                if (countRT < 0) answer.append("T");
                else answer.append("R");
                if (countCF < 0) answer.append("F");
                else answer.append("C");
                if (countJM < 0) answer.append("M");
                else answer.append("J");
                if (countAN < 0) answer.append("N");
                else answer.append("A");

                return answer.toString();

            }
        }
    }
}
