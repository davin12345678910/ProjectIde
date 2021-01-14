/*
//recursive backtracking or backtracking  

//recursive backtracking can be one of the easiest thing
//and if you know it very well, then you can get it done easily
//however, it is conceptaully difficult  

//it is similar to exhaustive search 
   3-digit  1, 2, 3
   |||      3 1 2  
   for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
         for (int k = 1; k <= 3; k++) {
            System.out.println("" + i + j + k);
         }
      }
   }
   
   //the output to have  
   111, 112, 113
   121, 122, 123 
   
   it is kindof like a mechanical counter
   certain things will change quicker than others  
   
   //concept of search space  
   d1?      |      |      |
            1      2      3
        |   |   |
        1   2   3
       ||| ||| |||
       123 123 123
       
  the nested for loop goes from left to right  
  backtracking to go back to where we had a choice 
  
  you have a notion of a dead end, and that you don't keep on going  
  
  //There is an example where if you move north right by one  
  if you go east you increase left by one
  if NE both left and right increase
  
  */
  
  /*
  this will be medium hint for the assignment  
  
  8 Queens  
  */
  
  //pre : queens have been plaved in columsn less than col so that no two
  //of them therathen each other
  //post : explores all placements of queens starting in column col,
  //printing solutions to 8 queens  
  private static void explore(Board b, int col) {
     //when you get to column 9, then you got all the solution 
     if (col > b.size()) {
        b.print(); //hooray!
     } else {
        //you are not limited on loops, you can use them
        for (int row = 1; row <= b.size(); row++) { 
        
           //this allows you to choose the best option 
           //it might have to remove, if it dosen't work, and redos it  
           if (b.safe(row, col)) {
              // backtracking pattern: choose, explore, unchoose (clean up after ourselves) 
  /*choose*/              b.place(row, col);
  /*explore*/             explore(b, col + 1); //this allows you to look around each row 
  /*unchoose*/            b.remove(row, col); //putting a queen a different row  
           } 
        }
     }   
  }
  
  //post: prints all solutions to 8 queens 
  public static void solve(Board b) {
     explore(b, 1);
  }
}