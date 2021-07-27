public class CheckCotSum {
   public static void main(String[] args) {
      int n=13332,cat=4;
      int result = checkCotSum(n,cat);
      System.out.println(result);
   }
   private static int checkCotSum(int n, int cat) {
     int totalSum =0;
     int orginalNub=n;
      while (n!=0) {
         
         int digit = n%10;
         int concatSum = 0;

         for (int i = 0; i < cat; i++) {
            concatSum = (concatSum * 10)+ digit;
         }
         totalSum +=concatSum;
          n /=10;
      }
         return (orginalNub==totalSum) ? 1 :0 ;    
   }
}
