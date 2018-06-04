import java.util.Arrays;

public class Problem{

   /**
    * Precondition: list is not null
    * Postcondition: moves all 0's to the end of the array, keeping the original order of all other elements
    * If list is {2, 0, 2, 0, 4}, changes list to {2, 2, 4, 0, 0}
    * If list is {1, 3, 3, 7}, "changes" list to {1, 3, 3, 7} 
    * If list is {0, 0, 1, 2, 3}, changes list to {1, 2, 3, 0, 0}
    * If list is {4, 5, 0, 6, 0}, changes list to {4, 5, 6, 0, 0}
    */
   public static void zerosToEnd(int[] list){
      int shiftedNum = 0;
      int numZeros = Arrays.stream(list).filter(num -> num == shiftedNum).toArray().length;
      int[] noZero = Arrays.stream(list).filter(num -> num != 0).toArray();
      System.arraycopy(noZero, 0, list, 0, noZero.length);
      Arrays.fill(list,list.length - numZeros, list.length, shiftedNum);
   }

   public static void main(String[] args){
      int[] list1 = {2, 0, 2, 0, 4};
      zerosToEnd(list1);
      for(int i: list1)
         System.out.print(i + " "); //2 2 4 0 0
      System.out.println();
      
      int[] list2 = {1, 3, 3, 7};
      zerosToEnd(list2);
      for(int i: list2)
         System.out.print(i + " "); //1 3 3 7
      System.out.println();
      
      int[] list3 = {0, 0, 1, 2, 3};
      zerosToEnd(list3);
      for(int i: list3)
         System.out.print(i + " "); //1 2 3 0 0
      System.out.println();
      
      int[] list4 = {4, 5, 0, 6, 0};
      zerosToEnd(list4);
      for(int i: list4)
         System.out.print(i + " "); //4 5 6 0 0
      System.out.println();
   }
}