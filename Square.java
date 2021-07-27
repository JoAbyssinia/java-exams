public class Square {
   
   public static void main(String[] args) {
      System.out.println(isSquare(4));
      System.out.println(isSquare(25));
      System.out.println(isSquare(-4));
      System.out.println(isSquare(8));
      System.out.println(isSquare(0));
   }

   private static int isSquare(int n){
      if(n<0) return 0;

      for (int i = 0; i <= n; i++) {
         
         if (i*i==n) {
            return 1;
         }
         if (i*i > n) {
            return 0;
         }
      }
      return 0;
   }
}
