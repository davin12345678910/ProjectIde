import java.util.*;

public class Uniqueness {
//good job, you have passed this problem 


   public static void main(String[] args) {
      Map<String, String> list = new HashMap<String, String>();
      //list.put("Kendrick", "Perkins");
      list.put("Marty", "Stepp");
      list.put("Stuart", "Reges");
      list.put("Jessica", "Miller");
      list.put("Amanda", "Camp");
      list.put("Hal", "Perkins");
      System.out.println(list);
      System.out.println("Do the keys in this map have similar values? Answer: " + isUnique(list));  
   }
   
   public static boolean isUnique(Map<String, String> list) {
      if (list.size() == 0) {
         return true;
      } 
      Map<String, Integer> unique = new HashMap<String, Integer>();
      
      for (String name : list.keySet()) {
         String person = list.get(name);
         if (!unique.containsKey(person)) {
            unique.put(name, 1);
         } else {
            unique.put(name, unique.get(name) + 1);
         }   
      }  
      for (String n: unique.keySet()) {
         int count = unique.get(n);
         if (count > 1) {
            return false;
         }
      }      
      return true;                
   }   
}