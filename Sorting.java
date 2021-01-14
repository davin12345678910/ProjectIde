import java.util.*;

public class Sorting {
   
   //a set will easily love your problem, without it the problem would be more tricker
   //it would take perhaps a nested for loop, because you need to compare
   //to all the values, so for each value you look at, you need to compare it
   //to all of the other values in whihc you will have  
   
   //look for a way to solve this problem without a set  
   
   public static void main(String[] args) {
      Queue<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(-2);
      list.add(4);
      list.add(-5);
      list.add(8);
      list.add(-8);
      list.add(12);
      list.add(-15);
      list.add(23);
      System.out.println(list);
      reOrder(list);
      System.out.println(list);
   }
   
   public static void /*Set<Integer>*/ reOrder(Queue<Integer> list) {
   //we could easily solve this problem by using a TreeSet <---
      /*
      Stack<Integer> newList = new Stack<Integer>();
      int size = list.size();
      int first = list.remove();
      for (int i = 0; i < size - 1; i++) {
         int second = list.remove();
         if (second > first) {
            newList.push(first);
            first = second;
         } else {
            newList.push(second);
         }
      }
      System.out.println(newList);
      while (!newList.isEmpty()) {
         list.add(newList.pop());
      }
      */
      
      
      Set<Integer> newList = new TreeSet<Integer>();
      int size = list.size();
      for(int i = 0; i < size; i++) {
         newList.add(list.remove());
      }
      return newList;  
      
      
      /*
      Stack<Integer> newList = new Stack<Integer>();
      int size = list.size();
      for (int i = 0; i < size; i++) {
         int value = list.remove();
         int count = 0;
         for (int j = 0; j < size - 2; j++) {
            int compare = list.remove();
            if (value > compare) { 
               count++;
            }
            list.add(compare);
         }
         if (count > 0) {
            list.add(value);
         } else {
            newList.add(value);
            i--;
         }
      }
      */
      
      
      //since it is already sorted by absolute value, all you have to 
      //do is remove all the negatives, and then put them back in later     
   }
}