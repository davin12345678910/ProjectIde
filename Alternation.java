import java.util.*;

public class Alternation {
   //you will want to use an iterator for a list,
   //it is like a scanner and will allow you to 
   //read through the list 
   
   public static void main(String[] args) {
      List<Integer> list1 = new LinkedList<Integer>();
      //List<Integer> list2 = new LinkedList<Integer>();
      list1.add(0);
      list1.add(0);
      list1.add(2);
      list1.add(0);
      list1.add(4);
      list1.add(0);
      list1.add(6);
      list1.add(0);
      list1.add(8); 
      list1.add(0);
      list1.add(10); 
      list1.add(0);
      list1.add(12);
      list1.add(0); 
      list1.add(14); 
      list1.add(0);
      list1.add(16);
      System.out.println(removeInRange(list1, 0, 5, 13));
   }
   
   public static List<Integer> removeInRange(List<Integer> list, int rid, int a, int b) {
      Iterator<Integer> change = list.iterator();
      List<Integer> newest = new LinkedList<Integer>();
      for (int i = 0; i < a; i++) {
         int numb = change.next();
         newest.add(numb);
      }
      for (int i = a; i < b; i++) {
         //here do something that sees if the iterator has stuff
         int numb = change.next();
         if (numb != rid) {
            newest.add(numb);
         }
         //then here say remove if it is change
      }
      for (int i = b; i < list.size(); i++) {
         int num = change.next();
         newest.add(num);
      }
      return newest;
   }
   
   /*
   public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
      Iterator<Integer> i1 = list1.iterator();
      Iterator<Integer> i2 = list2.iterator();
      List<Integer> newest = new LinkedList<Integer>();
      //remember that the iterator is like a scanner,
      //so you can use it in a similar way/ style
      
      while (i1.hasNext() || i2.hasNext()) {
         if (i1.hasNext()) {
            newest.add(i1.next());
         }
         
         if (i2.hasNext()) {
            newest.add(i2.next());
         }
      }
      return newest;
   }
   */
}
      
      
   