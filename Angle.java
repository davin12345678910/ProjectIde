//hashing is something that they don't really cover, and as
//dennis said, they even said that they could skip that day as well  

/*
comaprabnle interface and binary search trees  


*/

//class invariant: degrees >= 0 and 0 <= minutes < 60 <--- never allowed to be ina  corrupt state  

public class Angle implements Comparable<Angle> {  
   private int degrees;
   private int minutes;
   
   //pre: degrees >= 0 and minutes >= minutes >= and minutes < 60 
   //   (throws IllegalArgumentException if not)    
   public Angle (int degrees, int minutes) {
      
      //you have to use the this notation or esle there will be shadowing
      if (degrees < 0 || minutes < 0 || minutes >= 60) {
         throw new IllegalArgumentException();
      }
      
      this.degrees = degrees;
      this.minutes = minutes;
   }
   

   public String toString() { //you override the toString method  
      return degrees + "d " + minutes + "m";
   }
   
   public Angle add(Angle other) {
   
      //only use this if there is the possibility of shadowing  
      
      //private means private to the class
      //the other angles have access to anothe angles information 
      
      //but another method will not have access to the angle information  
      int d = degrees + other.degrees;
      int m = minutes + other.minutes;
      // m % 60, m /60 <--- you will want to use this  (Stuart loves mod) <--- this is something that stuart will say  
      //maybe you want to use a while loop, but the invriant helps out with that   
      if (m >= 60) {
         m = m - 60
         d++;  
      }  
      return new Angle (d, m);
   }
}




