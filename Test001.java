import java.util.ArrayList;
import java.util.Collections;

public class Test001 {
    public String solution(String s) {

        ArrayList<Integer> prime = new ArrayList<Integer>();
        ArrayList<Integer> noneprime = new ArrayList<Integer>();

        String[] array = s.split(" ");

        int[] list = new int[array.length];
        for (int h = 0; h < array.length; h++)
            list[h] = Integer.parseInt(array[h]);

        for (int num : list)
            if (isPrime(num)) {
                prime.add(num);
            }else noneprime.add(num);

        int max = Collections.max(prime);
        int min = Collections.min(noneprime);
        String answer = max+" "+min;

        return answer;
    }
    private boolean isPrime(int num) {
        for (int k = 2; k < Math.sqrt(num); k++)
            if (num % k == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Test001 method = new Test001();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}

