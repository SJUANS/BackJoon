import java.util.Date;
import java.text.DateFormat;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Main {
    public static void main (String[] args){
        Date date = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.print(dateFormat.format(date));
    }
}