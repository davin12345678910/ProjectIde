/*
recursion is an alternative to iteration, which are loops,
and we assocaite this with procedural programming (classical programming);

recursion is equally powerful as loops, and different people use either of the two
and it really depends on the person and their opinions

Recursion <--- it is called functional programming, and in some languages it
is considered the main form of programming  

there is a lot more people in the iteration camp

there are certain problems that will ask for either of the two
after assignment #5 - assignment #8, you will be using recursion, and it is something 
that is hard to use well

iterative approach, where a lot of the work is done by one thing 

but in a functional programming situation, the person would have to ask the person
in the front, and the robots will keep asking, until one of the robots dosen't see
anything in the front  

sarah, would ask what row are you in, and the next robot would do the same, and so on,
when you reach the front they all can figure it out  

Recursion, means that the thing is occuring again  

//when a robot dosen't see a robot in the front, it wil say that it is the base case

the idea that each of the things will do a little bit of the work 

//imagine a stair case
two techniques needed to go down to the floor
-needs the ability to go down a step  //recursive case
-needs to also know when you are on the ground  //this is the base case in the situation

you are going to have a case anaylsis, you are going to have at least one
recursive case and one base case  

base case stops the process 
*/

//first recursion lecture  

import java.util.*; 

public class RepeatingRecursion {
   
   public static void main(String[] args) {
      writeString(10);
      Scanner input = new Scanner("this is fun no?");
      reverse(input);
      System.out.println(stutter(348));  
   }
   
   /*
   public static void writeString(int a) {
      for(int i = 0; i < n; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
   */
   
   public static void writeString(int n) {
      //you will stop once n is at the value of 0  
      if (n == 0) {
         System.out.println();
      } else {
         //this is how you will print out ten
         //stars in the programming  
         System.out.print("*");
         //it is closer to zero when you do (n-1) <--- you are updating it  
         writeString(n - 1);
      }
   }
   //this    no?
   //is      fun
   //fun     is
   //no?     this
   
   //recursive programming can be very short, but it is hard to do yourself  
   public static void reverse(Scanner input) {
      if (input.hasNext()) {
         //you need to look at the first thing
         String word = input.next();
         //then this will reverse everything else  
         reverse(input);
         System.out.println(word);
      }
   }
   
   public static int stutter(int n) {
      //you want to multiply by eleven by one digit numbets
      
      if (n < 0) {
         return -stutter(-n);
      }
      if (n < 10) {
         return n * 11;
      } else {
         //leading digit for n / 10
         return stutter(n / 10) * 100 + stutter(n % 10);
         //last digit for n % 10
      }
   }
   /*
   
   //it is like a call stack, that is how the solution is solved
   //it is a built in call stack  
   
   //you are going to be in the middle of the call, but then you later call them again
   //and then they later will go away     
   
   they read in
   this
   is
   fun 
   no?
   //then they all reverse, and you will get
   
   no?
   fun
   is
   this  
   
   call stacks do take quite a bit of memory, so you got to be careful about it 
   */     
}

/*
***
ws(3)
the elements are on a for loop can be related to a recursion case

recursion will use if and else a lot <--- it is a common thing that we are going to see
*/  














