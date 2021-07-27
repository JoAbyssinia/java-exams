public class FactorialPrime {
   
   public static void main(String[] args) {
      System.out.println(isFactorialPrime(2));
      System.out.println(isFactorialPrime(3));
      System.out.println(isFactorialPrime(7));
      System.out.println(isFactorialPrime(8));
      System.out.println(isFactorialPrime(11));
      System.out.println(isFactorialPrime(721));
   }

   private static int isFactorialPrime(int n){
      if(n<0) return 0;
      if(n==1 || n==2) return 1;

      int checker = 0;
      for (int i = 2; i < n; i++) {

         for (int j = 2; j < i; j++) {
            if (i%j==0 && factorial(i)<n){
               checker++;
               break;
            }
         }
         if (checker==0) {
            if ((factorial(i)+1)==n) {
               return 1;
            }
         }
         checker=0;  
      }
      return 0;
   }

   private static int factorial(int n){
      int ans=1;
      for (int i = 1; i <= n; i++) {
         ans *=i;
      }
      return ans;
   }
}
