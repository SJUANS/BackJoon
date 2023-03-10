class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // 분모 p*q, 분자 nq + mp
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        // 기약분수 처리 
        for (int i=numer; i>1; i--) {
            if ((numer % i == 0) & (denom % i == 0)) {
                numer = numer / i;
                denom = denom / i;
            }
        }
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}