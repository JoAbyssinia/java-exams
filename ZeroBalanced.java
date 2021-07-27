public class ZeroBalanced {
   
   public static void main(String[] args) {
      System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
   }

   private static int isZeroBalanced(int[] a ){
      int matchCounter = 0;
      if(a.length % 2 != 0 || a.length < 2) return 0;
      
      for (int i = 0; i < a.length/2; i++) {
         for (int j = i+1; j < a.length; j++) {
            if (a[i]+a[j]==0) {
               matchCounter++;
               break;
            }
         }
      }
     
      return (matchCounter == a.length/2)?1:0;
   }
}
