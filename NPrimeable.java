public class NPrimeable {
   public static void main(String[] args) {
      System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
      System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
      System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
      System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
      System.out.println(isNPrimeable(new int[]{}, 2));  
   }
   private static int isNPrimeable(int[]a, int n ){
      if(a.length==0) return 1;

      for (int i : a) {
         for (int j = 2; j < i+n; j++) {
            if((i+n)%j ==0)return 0;
         }
      }
      return 1;
   }
}
