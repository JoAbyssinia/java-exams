public class Layered {
   
   public static void main(String[] args) {
      System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
      System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
      System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
      System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
      System.out.println(isLayered(new int[]{2}));
      System.out.println(isLayered(new int[]{}));
   }
   private static int isLayered(int[] a){
      if(a.length <= 1) return 0;
      int counter=1;
      for (int i = 0; i < a.length-1; i++) {
       
         if(a[i]>a[i+1]) return 0;

         if (a[i]==a[i+1]) {
            counter++;
         }

         if (a[i] != a[i+1]) {
            if(counter<2){
               return 0;
            }
            counter=1;
         }

      }
      return 1;
   }
}
