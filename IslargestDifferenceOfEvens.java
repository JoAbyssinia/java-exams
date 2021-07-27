public class IslargestDifferenceOfEvens {
   public static void main(String[] args) {
      System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
      System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
      System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
      System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
   }

   private static int largestDifferenceOfEvens(int[]a ){
      int diff = -1;

      for (int i = 0; i < a.length-1; i++) {
         for (int j = i+1; j < a.length; j++) {
            if (a[i]%2==0 && a[j] %2 ==0) {
               if (Math.abs(a[j]-a[i])>diff) {
                  diff = Math.abs(a[j]-a[i]);
               }
            }
         }
      }
      return diff;
   }
}
