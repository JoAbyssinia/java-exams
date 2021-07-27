import java.util.Arrays;

public class SystematicallyIncreasing {
   public static void main(String[] args) {
      System.out.println((isSystematicallyIncreasing(new int[]{1})));
      System.out.println((isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3})));
      System.out.println((isSystematicallyIncreasing(new int[]{1, 1, 3})));
      System.out.println((isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2})));
      System.out.println((isSystematicallyIncreasing(new int[]{1,1,2,1,2,3,1,2,3,4})));
   }

   private static int isSystematicallyIncreasing(int[] a){
      if(a.length==1 && a[0]==1) return 1;
      int length = a[a.length-1];
      int index=0;
      for (int i = 1; i <= length; i++) {
         
         for (int j = 1; j <= i; j++) {
            if (a[index] !=j) {
               return 0;
            }
            index++;
         }
      }
      return 1;
   } 
}
