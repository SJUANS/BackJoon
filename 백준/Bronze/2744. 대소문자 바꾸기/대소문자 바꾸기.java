import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        String line = br.readLine();
        int n = line.length();
        
        for (int i=0; i<n; i++) {
            char c = line.charAt(i);
                if (Character.isUpperCase(c)){
                  String converted = String.valueOf(c).toLowerCase();
                  builder.append(converted);
                } else {
                  String converted = String.valueOf(c).toUpperCase(); 
                  builder.append(converted);
                } 
        }
        System.out.println(builder);
    }
}