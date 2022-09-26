class Chap031 {
    public int solution(int n) {
        int count = 0;

        for (int i=2; i<=n; i++)
            if (isPrime(i)) count++;

        return count;
    }

    private boolean isPrime(int i) {
        for (int k=2; k<Math.sqrt(i); k++)
            if (i%k==0) return false;
        return true;
    }
}


