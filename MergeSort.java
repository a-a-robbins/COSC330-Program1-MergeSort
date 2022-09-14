import java.util.Arrays;
import java.util.Random; 


public class MergeSort {

   private static Random rand = new Random(); 


   public static void generateArray(int[] numbers) {
         
      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(); 
      }
   
   }

   public static void mergesort(int[] A, int left, int right) {
   
     if(left >= right) {
      return; 
     }
     
     int mid = (left + right) / 2; 
     
     //TEST: print mid
     System.out.println("mid = " + mid); 
     
     int[] leftArray = new int[mid - left]; 
     int[] rightArray = new int[right - (mid + 1)];
     
     for(int i = 0; i < mid; i++) {
      leftArray[i] = A[i];
     }
     
     for(int j = mid; j < right; j++) {
      rightArray[j] = A[j]; 
     }
     
     
     //TEST: did the arrays split properly? 
      System.out.println("Left Array: "); 
      for(int i = 0; i < leftArray.length; i++) {
         System.out.print(leftArray[i] + ", "); 
      }
      System.out.println(); 
      
        
   
          
     mergesort(A, left, mid); 
     mergesort(A, (mid + 1), right); 
     
     //merge(A, left, mid, right); 
   
   }
   
   
   private static void merge(int[] A, int left, int mid, int right) {
   
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
      
      mergesort(mergeSortMe, 0, (mergeSortMe.length - 1)); 
         
   }
   
}



