import java.util.HashMap;

public class Maps {
     public static void main(String[] args) {
         //key:emp name, value:emp ids
         HashMap<String, Integer> empIds = new HashMap<>();
         empIds.put("John", 1234); //put can add and update the value. but replace can work just when the name is there.
         empIds.put("Jane", 5678);
         empIds.put("Bob", 9876);

         System.out.println(empIds);
         System.out.println(empIds.get("John"));
         System.out.println(empIds.containsKey("Jane"));
         System.out.println(empIds.containsValue(3455));
         System.out.println(empIds.remove("Bob"));
         System.out.println(empIds);

     }
}
