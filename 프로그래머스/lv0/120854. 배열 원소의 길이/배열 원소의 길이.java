class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        
        for (String str : strlist) {
            answer[i]= str.length();
            i += 1;
        }
        return answer;
    }
}