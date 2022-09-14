import java.util.Arrays;
import java.util.Random; 


public class MergeSort {

   private static Random rand = new Random(); 


   public static void generateArray(int[] numbers) {
         
      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(100); 
      }
   
   }
   
   public static void mergesort(int[] A) {
      mergesort(A, 0, A.length - 1); 
      System.out.println("Sorted Array: "); 
      for(int i = 0; i < A.length; i++) {
         System.out.print(A[i] + ", "); 
      }
      System.out.println();
      
    }

   private static void mergesort(int[] A, int left, int right) {
   
     if(left >= right) {
      return; 
     }
     
     int mid = (left + right) / 2; 
     
     //TEST: print mid, left, right
     System.out.println("mid = " + mid);
     System.out.println("left = " + left); 
     System.out.println("right = " + right); 
     //END TEST
        
          
     mergesort(A, left, mid); 
     mergesort(A, mid + 1, right); 
     
     merge(A, left, mid, right); 
   
   }
   
   
   private static void merge(int[] A, int left, int mid, int right) {
      //TEST: what is being passed in
      System.out.println("At merge() left = " + left); 
      System.out.println("At merge() right = " + right); 
      //END TEST
      
      int leftSize = mid - left + 1; 
      int rightSize = right - mid; 
   
      //TEST: print left and right sizes
      System.out.println("leftSize = " + leftSize);
      System.out.println("rightSize = " + rightSize); 
      //END TEST
      
      int[] leftArray = new int[leftSize]; 
      int[] rightArray = new int[rightSize]; 
      
      //TEST: did the arrays size properly
      System.out.println("leftArray size = " + leftArray.length);
      System.out.println("rightArray size = " + rightArray.length);
      
      for(int i = 0; i < (leftSize - 1); i++) {
         leftArray[i] = A[left + i]; 
      }
      
      for(int j = 0; j < (rightSize - 1); j++) {
         rightArray[j] = A[mid + j + 1]; 
      }
      
      //TEST: what do our arrays look like
      System.out.println("leftArray: "); 
      for(int i = 0; i < leftArray.length; i++) {
         System.out.print(leftArray[i] + ", "); 
      }
      System.out.println(); 
      
      System.out.println("rightArray: ");
      for(int i = 0; i < rightArray.length; i++) {
         System.out.print(rightArray[i] + ", ");
      }
      System.out.println(); 
      //END TEST
      
      int i = 0; 
      int j = 0; 
      int k = left; 
      
      while(i < leftSize && i < rightSize) {
         if(leftArray[i] <= rightArray[j]) {
            A[k] = leftArray[i]; 
            i = i + 1; 
         }
         else {
            A[k] = rightArray[j]; 
            j = j + 1; 
         }
      }
      
      while(i < leftSize) {
         A[k] = leftArray[i]; 
         i += 1; 
         k += 1; 
      }
      
      while(j < rightSize) {
         A[k] = rightArray[j]; 
         j += 1; 
         k += 1;
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



