public class LargestPrimeFactor {
   
   public static void main(String[] args) {
      
      System.out.print(largestPrimeFactor(7));
   }
   private static int largestPrimeFactor(int n) {
      
      if (n <=1) return 0;
        int number = n;
        while(number >1){
            if(n % number == 0){
                boolean isPrime = true;
                for(int i=2;i<number;i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) return number;
            }           
            number--;
        }
        return 0;
   }
}
