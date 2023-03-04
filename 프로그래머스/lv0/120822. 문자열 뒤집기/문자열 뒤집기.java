class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        int N = my_string.length() - 1;
        char[] arr = my_string.toCharArray();
        
        for (int i=N; i>=0; i--){
            sb.append(Character.toString(arr[i]));
        }
        
        String answer = sb.toString();
        return answer;
    }
}