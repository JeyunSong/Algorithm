
public class Test002 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String [] array = s.split("");
        int count = 0;

        for (int k=0; k<array.length; k++)
            if (array[k].equals(" ")) {
                continue;
            } else if (count%2==0) {
                array[k] = array[k].toUpperCase();
                count++;
            } else {
                array[k] = array[k].toLowerCase();
                count++;
            }
        for (int i=0; i< array.length;i++)
            answer.append(array[i]);

        return answer.toString();
    }

    public static void main(String[] args) {
        Test002 method = new Test002();
        String s = "hang hae ninety nine";
        System.out.println(method.solution(s));
    }
}
