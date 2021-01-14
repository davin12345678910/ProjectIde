//List of E is briefly touched upin, however it
//is not something that will be on the assignments  


/*
public static Stack<Integer> copyStack(Stack<Integer> list) {
   Queue<Integer> listTemp = new LinkedList<Integer>();
   Stack<Integer> list2 = new Stack<Integer>();
   while (!list.isEmpty()) {
      int value = list.pop();
      listTemp.add(value);
   }
   
   while (!listTemp.isEmpty()) {
      list.push(listTemp.remove());
   }
   
   while (!list.isEmpty()) {
      listTemp.add(list.pop());
   }
   
   while (!listTemp.isEmpty()) {
      int numb = listTemp.remove();
      list.push(numb);
      list2.push(numb);
   }
   return list2;
}
*/


public static void collapse(Stack<Integer> list) {
   Queue<Integer> list2 = new LinkedList<Integer>();
   while(!list.isEmpty()) {
      int num2 = 0;
      int numb1 = list.pop();
      if (list.seek() != null) {
         numb2 = list.pop();
      }
      int sum = numb1 + numb2;
      list2.add(sum);
   }
   while (!list2.isEmpty()) {
      list.push(list2.remove());
   }
   
   while (!list.isEmpty()) {
      list2.add(list.pop());
   }
   
   while (!list2.isEmpty()) {
      list.push(list2.remove());
   }
}
   
  