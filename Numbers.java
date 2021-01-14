//recursion practice  

public class Numbers {

   public static void main(String[] args) {
      writeNums(5);
      System.out.println();
      writeNums(12);
      System.out.println();
      writeSquares(5);
      System.out.println();
      writeChars(8);
      System.out.println();
      writeChars(2);
      System.out.println();
      System.out.println(multiplyEvens(2));  
      System.out.println(multiplyEvens(3));
      System.out.println(sumTo(2));
      System.out.println(sumTo(10));
      System.out.println(repeat("hi ho! ", 5));
      //System.out.println(isReverse("CSE143", "341esc"));
      System.out.println(starString(4));
   }
   
   public static void writeNums(int repeat) {
      if (repeat == 1) {
         System.out.print(1);
      } else {
         writeNums(repeat - 1);
         System.out.print(", " + repeat);
      }
   }
   
   public static void writeSquares(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      } 
      if (n == 1) {
         System.out.print(1);
      } else if (n % 2 == 0) {
         writeSquares(n - 1);
         System.out.print(", " + n * n);
      } else {
         System.out.print(n * n + ", ");
         writeSquares(n - 1);
      }
   }  
   
   public static void writeChars(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      }
      if (n == 1) {
         System.out.print("*");
      } else if (n == 2) {
         System.out.print("**");
      } else {
         System.out.print("<");
         writeChars(n - 2);
         System.out.print(">"); 
      }
   }  
   
   public static int multiplyEvens(int n) {
      if (n < 1) {
         throw new IllegalArgumentException();
      }
      if (n == 1) {
         return 2;
      } else {
         return 2 * n * multiplyEvens(n - 1);
      }
   } 
   
   public static double sumTo(int n) {
      if (n < 0) {
         throw new IllegalArgumentException();
      }
      if (n == 0) {
         return 0.0;
      } else if (n == 1) {
         return 1.0;
      } else {
         return (1.0 / n) + sumTo(n - 1);
      }
   }
   
   //for digit match, you are going to have to usse / and % to look at the numbers
   
   public static String repeat(String word, int times) {
      if (times < 0) {
         throw new IllegalArgumentException();
      }
      if (times == 0) {
         return "";
      } else {
         return word + repeat(word, times - 1);
      }
   }
   
   /*
   public static boolean isReverse(String word1, String word2) {
      if (
   
   } 
   */
   //look into isReverse later
   
   /*
   public static void dedup(String word) {
   */
   
   public static String starString(int number) {
      if (number < 0) {
         throw new IllegalArgumentException();
      }
      if (number == 0) {
         return "*";
      } else {
         return starString(number - 1) + starString(number - 1);
      }
   }
   //once you go in it would be 2, then the next time it would be 4
   //then out of those 4, once you do it again, you will get 8, 
   //and then 16, and then so on...
}
         