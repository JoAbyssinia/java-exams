public class IshasNValues {
   public static void main(String[] args) {
      System.out.println(hasNValues1(new int[]{1, 2, 2, 1}, 2));
      System.out.println(hasNValues1(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
      System.out.println(hasNValues1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
      System.out.println(hasNValues1(new int[]{1, 2, 2, 1}, 3));
      System.out.println(hasNValues1(new int[]{1, 1, 1, 4, 1, 1, 1, 3, 3}, 2));
      System.out.println(hasNValues1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));  
   }
   private static int hasNValues(int[] a, int n ){

      for (int i = 0; i < a.length-1; i++) {
         for (int j = i+1; j < a.length; j++) {
           
            if(Math.abs(a[j]-a[i])+1==n) {
               return 1;
            }
         }
      }
      return 0;
   }

   private static int hasNValues1(int[] a, int n ){
      int[] diff = new int[a.length];
      int index=0;
      for (int i : a) {
         boolean ch=true;

         for (int j : diff) {
            if (i==j) {
               ch=false;
               break;
            }
         }
         if (ch) {
            diff[index] = i;
            index++;
         }
      }
      return index == n ? 1:0;
   }
}
