import java.util.*;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       List<Integer> numbers = new ArrayList<>();
        
       for (int j=0; j<9; j++) {
          numbers.add(sc.nextInt()); 
       }
       
       Iterator<Integer> it = numbers.iterator();
       int max = 0;
       int index = -1;
       
       while (it.hasNext()){
           int num = it.next(); 
           max = Math.max(num, max);
       }
       
       for (int i=0; i<9; i++){
           if (numbers.get(i) == max){
               index = i+1;
           }
       }
        
       System.out.println(max);
       System.out.println(index);
    }
}