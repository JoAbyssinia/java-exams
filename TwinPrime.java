public class TwinPrime {
   public static void main(String[] args) {
      System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
   }
   private static int isTwinPrime(int n){
      int mTwo=0,pTwo=0;
     for(int i=2;i<n;i++){
        if (n%i==0) {
           return 0;
        }
      }

        for(int j=2;j<n+2;j++){
         if ((n+2)%j==0) {
            pTwo++;
          break;
            
         }
      }

         for(int k=2;k<(n-2);k++){
            if ((n-2)%k==0) {
               mTwo++;
               break;
            }
         }

         return (mTwo==0 || pTwo==0) ? 1 : 0;
     } 
   }
