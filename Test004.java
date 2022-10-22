import java.util.ArrayList;
import java.util.Arrays;

public class Test004 {
    public int solution(int[] arr1) {
        int answer = 0;

        Arrays.sort(arr1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : arr1) arr.add(i);

        ArrayList<Integer> list = new ArrayList<>();
        int [] num = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : num) list.add(j);

        list.removeAll(arr);
        int result = 0;

        System.out.println(list);

        int [] number = new int[list.size()];
        for (int k=0; k<number.length; k++)
            number[k] = list.get(k);

        for (int l=number[0]; l<number[number.length-1]; l++)
            result += number[l];

        return answer;
    }

    public static void main(String[] args) {
        Test004 method = new Test004();
        int[] arr1 = {7,8,3,5,6,1,2,4};
        System.out.println(method.solution(arr1));
    }
}
