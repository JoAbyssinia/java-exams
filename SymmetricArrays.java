public class SymmetricArrays {
   public static void main(String[] args) {
      
      System.out.println(isSymmetricArrays(new int[]{1,2,3,3,2,1}));
      System.out.println(isSymmetricArrays(new int[]{4,5,6,6,5,4}));
      System.out.println(isSymmetricArrays(new int[]{0,0,1,1,0,0}));
      System.out.println(isSymmetricArrays(new int[]{4,4}));

   }

   private static int isSymmetricArrays(int[] a){
      for (int i = 0,j = a.length-1; i <= j; i++,j--) {
         if (a[i]!=a[j]) {
            return 0;
         }
      }
      return 1;
   }
}
