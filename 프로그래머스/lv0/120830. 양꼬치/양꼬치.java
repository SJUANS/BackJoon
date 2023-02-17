class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer = ((n*12000)+(k*2000)); 
        
        if (n >= 10) {
            for (int i=1; i <=(n/10); i++) {
                answer -= 2000;
            }
        }
        
        return answer;
    }
}