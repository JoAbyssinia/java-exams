public class Squere {
   public static void main(String[] args) {
      int n=4;
      int result = isSquere(n);
      System.out.println(result);
   }

   private static int isSquere(int n){
      for (int i = 0; i <= n; i++) {  
         if (i*i==n) {
            return 1;
         }
      }
      return 0;
   }
}
