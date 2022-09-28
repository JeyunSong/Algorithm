class Chap031 {
    public int solution(int n) {
        int count = 0;
// isPrime이 true면 카운트 ++
        for (int i=2; i<=n; i++)
            if (isPrime(i)) count++;

        return count;
    }
// 빠른 연산을 위해 i는 제곱근 까지만 계산
    private boolean isPrime(int i) {
        for (int k=2; k<Math.sqrt(i); k++)
            if (i%k==0) return false;
        return true;
    }
}


