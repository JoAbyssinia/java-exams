public class DigitIncreasing {
   
   public static void main(String[] args) {
      System.out.println(isDigitIncreasing( 7 ));
      System.out.println(isDigitIncreasing( 36 ));
      System.out.println(isDigitIncreasing( 984 ));
      System.out.println(isDigitIncreasing( 7404 ));
   }

   private static int isDigitIncreasing(int a){

      for (int i = 1; i <=9; i++) {
         int sum = i;
         int itr=i;
         while (sum < a) {
           itr = ((itr*10)+i);
           sum += itr; 
         }
         if (sum==a) {
            return 1;
         }
      }
      return 0;
   }
}
