public class IsPrimeHappy {
   
   public static void main(String[] args) {
      System.out.println(primeHappy(5));
      System.out.println(primeHappy(25));
      System.out.println(primeHappy(32));
      System.out.println(primeHappy(8));
      System.out.println(primeHappy(2));

   }

   private static int primeHappy(int n){
      if(n<=2) return 0;
      int sumPrimes=0;
      for (int i = 2; i < n; i++) {
         int checker = 0;

         for (int j = 2; j < i; j++) {
            if (i%j == 0) {
               checker++;
               break;
            }
         }
         if (checker ==0 ) {
            sumPrimes +=i;
         }
         checker=0;
      }

      if (sumPrimes%n==0) {
         return 1;
      }else{
         return 0;
      }

   }
}
