public class Chap026 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                String answer = "";
                String [] alpa = {"a", "b", "c", "d", "e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
                String [] ALPA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

                String[] array = s.split("");

                for (int i=0; i<array.length; i++) {
                    array[i] = array[i].replace(alpa[i], alpa[(i+n)%alpa.length]);
                    array[i] = array[i].replace(ALPA[i], ALPA[(i+n)%ALPA.length]);
                }

                for (int k=0; k< array.length; k++) {
                    answer += array[k];
                }
                return answer;
            }
        }

    }
}