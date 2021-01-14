public class RecursionStrings {

   public static void main(String[] args) {
      /*
      starString(0); 
      System.out.println(); 
      starString(1);
      System.out.println();
      starString(2);
      System.out.println();
      starString(3);
      System.out.println();
      starString(4);
      System.out.println();
      */
      /*
      writeNums(5);
      System.out.println();
      writeNums(12);
      */
      System.out.println(multiplyEvens(1));
      System.out.println(multiplyEvens(3));
   }
   
   public static int multiplyEvens(int n) {
      if (n <= 0) {
         throw new IllegalArgumentException();
      }
      if (n == 1) {
         return 2;
      } else {
         return n * 2 * multiplyEvens(n - 1);//you want to keep on multiplying to the past result
         //what this does is that it multiplies 
         
      } 
   }
   
   /*
   //12.2
   public static void writeNums(int n) {
      if(n < 1) {
         throw new IllegalArgumentException();
      }
      if (n == 1) { //cannot be lower than 1, or else if won't work
         System.out.print(" 1");
      } else {
         writeNums(n - 1);   //a very small change can make a very big difference in recursion  
         System.out.print(", " + n);  
      }
   }
   */
   
   /*
   this is 12.1
   public static void starString(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      }
      if (n > 0) {
         starString(n - 1);// when you do recursion this way it does it to the power
         starString(n - 1);
      } else if (n == 0) {
         System.out.print("*"); //this is the base case for the problem
      }
   }
   */   
}