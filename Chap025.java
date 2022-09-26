
class Chap025 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
// left부터 right까지 반복
        for (int i = left; i <= right; i++)
// boolean 메소드를 사용하여 true면 +i false면 -i
            if (test(i))  count += i;
            else count -= i;

        return count;
    }
    // 약수의 짝수/홀수 판별 boolean 메소드
    private boolean test(int i) {
        int count3 = 0;
        for (int k = 1; k <= i; k++)
            if (i % k == 0) count3++;

        return count3 % 2 == 0;
    }
}


