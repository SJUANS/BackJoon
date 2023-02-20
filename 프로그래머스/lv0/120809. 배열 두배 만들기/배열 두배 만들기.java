import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int N = numbers.length;
        int[] answer = new int[N];
        
        for (int i=0; i<N; i++) {
            answer[i] = numbers[i]*2;
        }
        
        return answer;
    }
}