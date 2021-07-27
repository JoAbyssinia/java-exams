public class ZeroPlentiful {
   public static void main(String[] args) {
      System.out.println(isZeroPlentiful (new int[]{0, 0, 0, 0, 0}));
      System.out.println(isZeroPlentiful ( new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
      System.out.println(isZeroPlentiful (new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
      System.out.println( isZeroPlentiful (new int[]{1, 2, 3, 4}));
      System.out.println(isZeroPlentiful (new int[]{1, 0, 0, 0, 2, 0, 0, 0}));
      System.out.println(isZeroPlentiful(new int[]{0}));
   }

   private static int isZeroPlentiful(int[] a ){
      if(a.length <=0 )return 0;

      int zeroCounter = 0;
      int counter = 0;

      for (int i : a) {
         if (i==0) {
            counter ++;
            if (counter == 4) {
               zeroCounter++;
            }
         }else{
            counter=0;
         } 
      }
      return zeroCounter;
   }
}
