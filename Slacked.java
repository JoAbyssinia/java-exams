public class Slacked {
   public static void main(String[] args) {
      int n=7;
      int result = isSlacked(10);
      System.out.println(result);
   }

   private static int isSlacked(int n){
      int counter = 0;
      for (int i = 1; i <= n; i++) {
         counter += i;
         if (counter == n ) {
            return 1;
         }else if (counter > n) {
            break;
         }
      }
      return 0;
   }
}
