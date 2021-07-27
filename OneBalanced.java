public class OneBalanced {
   public static void main(String[] args) {
      System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
      System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
      System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
      System.out.println(isOneBalanced(new int[]{}));
      System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
      System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
      System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
      System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
   }

   private static int isOneBalanced(int[] a){
      if(a==null) return 1;
      int oneCounter =0;
      int nonOneCounter = 0;
      boolean non1Start =false;
      boolean non1End =false;
      for (int i = 0; i < a.length; i++) {

         if (a[i] == 1) {
            if (non1Start) non1End = true;
            oneCounter++;
        } else {
            if (non1End) return 0;
            non1Start = true;
            nonOneCounter++;
        }


         }
      return (oneCounter == nonOneCounter ) ? 1 :0 ; 
   }
}
