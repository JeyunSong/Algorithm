public class Chap041 {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                int countP = 0;
                int countY = 0;
                String[] str = s.split("");
                for (String value : str) {
                    if (value.equals("p") || value.equals("P")) countP++;
                    else if (value.equals("y") || value.equals("Y")) countY++;
                }return countP == countY || (countP == 0 && countY == 0);
            }

        }
    }
}
