import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] index = new int[26];
        for (int i=0; i<26; i++) {
            index[i] = -1; // #1: 여기서 향상된 for문을 써버리면 안됨
        }

        for (int j=0; j<word.length(); j++) {
            char chr = word.charAt(j); // #2. i는 문자열에서의 위치
            if (index[chr - 'a'] == -1) {
                index[chr - 'a'] = j; // #3. [chr-'a']는 알파벳 인덱스에서의 위치
            }
        }

        for (int in : index) {
            System.out.print(in + " ");
        }
    }
}