import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fullgrade = br.readLine();
        char grade = fullgrade.charAt(0);
        double gpa = 0;

        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                System.out.println(gpa);
                return;
        }

        char sign = fullgrade.charAt(1);

        if (sign == '+') {
            gpa += 0.3;
        } else if (sign == '-') {
            gpa -= 0.3;
        }

        System.out.println(gpa);
    }
}
