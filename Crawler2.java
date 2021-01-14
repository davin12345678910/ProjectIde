import java.util.*;
import java.io.*;  

public class Crawler2 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("directory of the file name? ");
      String name = console.nextLine();
      File f = new File(name);
      if (!f.exists()) {
         System.out.println("Does not exist");
      } else {
         print(f);
      }
   }
   
   //it should print out the name of the given file or directory,
   //then it should check to see if it is a directory,
   //and if it is, then prints ALL of the contents of the directory  
   public static void print(File f) {
      print(f, 0);
   }
   
   public static void print(File f, int indent) {
      for (int i = 0; i < indent; i++) {
         System.out.print("   ");
      }
      
      
      System.out.println(f.getName());
      //f.listFiles(); //it will give me a list of the files, and you want to traverse through it  
      
      //you want to comments on every signifcant thing that a client would like to know about  
      System.out.println(f.getName());  
      if (f.isDirectory()) {
         for (File subF : f.listFiles()) {
            //System.out.println("  " + subF.getName());
            print(subF, indent + 1); //if you did i++, it would make more indentations than needed  
            //System.out.println("  " + subF.getName());
         }
      }
   }
}