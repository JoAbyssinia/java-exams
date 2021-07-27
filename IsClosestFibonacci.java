public class IsClosestFibonacci {
   public static void main(String[] args) {
      System.out.println(closestFibonacci(13));
      System.out.println(closestFibonacci(12));
      System.out.println(closestFibonacci(33));
      System.out.println(closestFibonacci(34));
   }
   public static int closestFibonacci(int n){
      if(n<1) return 0;
      if(n==1 || n==2) return 1;
      int fab1=1,fab2=1;
      int fabinonic = 1;
      for (int i = 3; i <= n; i++) {
        
         fabinonic = fab1+fab2;
           if (fabinonic> n) {
            return fab2;
         }

         if (fabinonic<=n) {
            fab1 = fab2;
            fab2 = fabinonic;
         }
       
      }
      return 0;
   }
}
