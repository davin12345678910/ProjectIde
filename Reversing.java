import java.util.*;

public class Reversing {
   public static void main(String[] args) {
      Scanner input = new Scanner("this is fun no?");
      reverse(input);
      System.out.println(power(5.0, -7.0));
   }

   public static void reverse(Scanner input) {
      if (input.hasNext()) {
         String word = input.next(); //you need this in order, to take only one value
         
         reverse(input);
         
         System.out.println(word);
         
         //reverse(input);
      }
      //each of the words will be read in from the scanner
      //after all the words are read, then it will start printing out the results  
      
      //the base case is when there are no longer anymore lines, and it means that there
      //is nothing to do, so you only need an if/else statement  
   }
   
   //this should work  
   public static double power(double a, double b) {
      //if you are told to throw an exception for a certain case
      //it will look something like this  
      
      //you want to combine all the conditions into one whole combo of if/else statements  
      if (b > 0) {
         return a * power(a, b - 1);
      } else if (b < 0) {
         //you want it to be -(b + 1), because it 
         return (1.0 / (a * power(a, -(b + 1)))); //maybe also ask why this is the case  
      //this will simplify the cases where y is to an even power
      
      /*   
      } else if (b % 2 == 0) {
         return power(a * a, b / 2);  //this code here is flawed, figure out why it's flawed  
      */
      } else {
         return 1;
      }
   } 
   
   //GCD
   //you need the formula gcd(y, x % y) <--- this is the ecludean formula for the gcd,
   public static int gcd(int x, int y) {
      if (x < 0 || y < 0) {
         return gcd(Math.abs(x), Math.abs(y));
      //this will use the stuff you had from before
      } else if (y == 0) {
         return x;
      } else {
         return gcd(y, x % y);
      }
   }
   
   /*
   
   //example
   3344__
   334400
   +
       88
   ______
   334488
   */
   
   public static int stuttered(int n) {
      //this has two recursive cases and one base case  
      
      if (n < 0) {
         return -stutter(-n);
      //this will allow you to get the negative version  
      } else if (n < 10) {
         return n * 11;
      } else { //remeber that / gets you the first value, and % gets the last value  
         return stuttered(n / 10) * 100 + stuttered(n % 10); //you need to multiply by 100
      }                                                      //because in order to add two digits,
   }                                                         //you need to shift it  
   
   //whenever you want to reverse the lines, read in the first one, reverse the others
   //and then after that, you will print out the first one  
}


/*
   public void reverse(Scanner input) {
      if (input.hasNext()) {
         String line = input.next(); //you want to read in a line of input  
         //powerful <--- you can write a few lines of codes that can do a lot of things
         //recognizing a recursive solution is easier than writing it yourself  
         reverse(input); //we need to reverse here
         System.out.println(line);
      }
      //there will be an implied else there is a base case where there is nothing to do
   }
*/
  
   /*
   this
   is
   fun
   no?
   */
   
//you need to believe that recursion works  

//when reverse calls reverse, it is like an army of robots, there are seperate reverse methods
//and there are many of them, not just one  


//call stack <--- it is something that is related in recursion  
//that is how the recursive solution works
//it is like a stack, where it does everything in reverse  

//it is like a stack that returns things in reverse from how they were read  






