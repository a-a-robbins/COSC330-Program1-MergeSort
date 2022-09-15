import java.util.Arrays;
import java.util.Random; 


public class MergeSort {

   private static Random rand = new Random(); 


   public static void generateArray(int[] numbers) {
         
      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(1000); 
      }
   
   }

   private static void sort(int[] A, int left, int right) {
      if (left >= right) {
         return;
      }
      
      int mid = (left + right)/ 2;

      sort(A, left, mid);
      sort(A,mid + 1, right);
      merge(A, left, mid, right);
   }

   public static void mergesort(int[] A) {
      sort(A, 0, A.length -1);
   }
   
   
   private static void merge(int[] A, int left, int mid, int right){
      
      int leftLength = mid - left +1;
      int rightLength = right - mid;

      int[] leftArray = new int [leftLength];
      int[] rightArray = new int[rightLength];

      for (int i = 0; i <= leftLength -1; i ++) {
         leftArray[i] = A[left + i];
      }

      for (int j = 0; j <= rightLength - 1; j++){
         rightArray[j] = A[mid + j +1];
      }

      int i = 0;
      int j = 0;
      int k = left;

      while (i < leftLength && j < rightLength){
         if (leftArray[i] <= rightArray[j]){
            A[k] = leftArray[i];
            i = i +1;
         }else {
            A[k] = rightArray[j];
            j = j +1;
         }
         k = k + 1;
      }

      while (i < leftLength) {
         A[k] = leftArray[i];
         i = i + 1;
         k = k + 1;
      }

      while(j < rightLength) {
         A[k] = rightArray[j];
         j = j +1;
         k = k +1;
      }
   }


   public static void main(String[] args) {
       
      int size = 10; 
             
      int[] mergeSortMe = new int[size]; 
      generateArray(mergeSortMe);
      mergesort(mergeSortMe);
      //TEST print our array to be merge-sorted
      System.out.println("TEST: print array mergeSortMe");
      for(int i = 0; i < mergeSortMe.length; i++) {
         System.out.print(mergeSortMe[i] + ", ");
      }
         
   }
   
}
