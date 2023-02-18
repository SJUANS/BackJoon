import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbersStr = br.readLine().split(" ");
        int[] numbers = new int[N];
        int max = -1000000; // 최댓값 판별시 첫 번째 요소는 최소 얘보다 같거나 커야 함
        int min = 1000000;  // 최솟값 판별시 첫 번째 요소는 최대 얘보다 같거나 작아야 함 
        
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(numbersStr[i]);
            numbers[i] = num; // 좌변과 우변의 위치는 아주 중요하다!!!!!
        }
        
        for (int num : numbers) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        
        System.out.print(min + " " + max);
    }
}
