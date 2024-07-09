import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LotteryNum {
 public static void main(String[] args) {
     Set<Integer> set = new HashSet<>();//to store unique lottery numbers
     Random random = new Random();//for generating random numbers
     for (int i = 0; i < 7; i++) {
         set.add(random.nextInt(49));
     }
     System.out.println(set);
 }
}
