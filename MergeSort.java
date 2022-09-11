import java.util.Arrays;
import java.util.Random; 


public class MergeSort {

   private static Random rand = new Random(); 


   public static void generateArray(int[] numbers) {
         
      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(); 
      }
   
   }

   public static void mergesort(int[] A) {
   
     
   
   }
   
   private static void sort(int left, int right) {
   
   }
   
   private static void merge(){
   
   }


   public static void main(String[] args) {
       
      int size = 10; 
             
      int[] mergeSortMe = new int[size]; 
      generateArray(mergeSortMe);
      
      //TEST print our array to be merge-sorted
      System.out.println("TEST: print array mergeSortMe");
      for(int i = 0; i < mergeSortMe.length; i++) {
         System.out.print(mergeSortMe[i] + ", ");
      }
         
   }
   
}



