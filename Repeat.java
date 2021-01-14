public class Repeat {

   public static void main(String[] args) {
      writeSequence(5);   
   }

   public static void writeSequence (int n) {
      if (n <= 0) {
         throw new IllegalArgumentException();
      }
      if (n == 1) {
         System.out.print("1 ");
      } else {
         //this is the equation nessecary for the problem  
         System.out.print((n + 1) / 2 + " ");
         //if you have a n that is odd, you will have the first value be two less
         if (n != 2) {
            writeSequence(n - 2);
         } 
         System.out.print((n + 1) / 2 + " ");
      }
   }
}