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
      mergesort(A, 0, (A.length - 1)); 
      
    }

   private static void mergesort(int[] A, int left, int right) {
   
     if(left >= right) {
      return; 
     }
     
     int mid = (left + right) / 2; 
     
     //TEST: print mid
     System.out.println("mid = " + mid); 
        
          
     mergesort(A, left, mid); 
     mergesort(A, (mid + 1), right); 
     
     merge(A, left, mid, right); 
   
   }
   
   
   private static void merge(int[] A, int left, int mid, int right) {
      int leftSize = mid - (left + 1); 
      int rightSize = right - mid; 
   
      //TEST: print left and right sizes
      System.out.println("leftSize = " + leftSize);
      System.out.println("rightSize = " + rightSize); 
      
      int[] leftArray = new int[leftSize]; 
      int[] rightArray = new int[rightSize]; 
      
      //TEST: did the arrays size properly
      System.out.println("leftArray size = " + leftArray.length);
      System.out.println("rightArray size = " + rightArray.length);
      
      for(int i = 0; i < (leftSize - 1); i++) {
         
      }
   }


   public static void main(String[] args) {
       
      int size = 10; 
             
      int[] mergeSortMe = new int[size]; 
      generateArray(mergeSortMe);
      
      //TEST print our array to be merge-sorted
      System.out.println("TEST: print array mergeSortMe");
      for(int i = 0; i < mergeSortMe.length; i++) {
         System.out.println(mergeSortMe[i] + ", ");
      }
      
      mergesort(mergeSortMe); 
         
   }
   
}



