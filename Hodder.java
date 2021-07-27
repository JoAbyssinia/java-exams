public class Hodder {
   public static void main(String[] args) {
     
      System.out.println(isHodder(3));
      System.out.println(isHodder(7));
      System.out.println(isHodder(31));
      System.out.println(isHodder(127));
      System.out.println(isHodder(4));

   }
   private static int isHodder(int n){
      for (int i = 2; i < n; i++) {
         if (n%i==0) {
            return 0;
         }
      }
      for (int i = 0; i < n; i++) {
         int power=1;
         for (int j = 1; j <= i; j++) {
            power *=2;
         }
         if ((power-1) == n) {
            return 1;
         }
         power =1;
      }
      return 0;
   }
}
