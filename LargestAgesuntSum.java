public class LargestAgesuntSum {
   
   public static void main(String[] args) {
      int[] data = {1,1,1,1,2,1,1,1};
      int reuslt = largestAgesuntSum(data);
      System.out.println(reuslt);
   }

   private static int largestAgesuntSum(int[] a ){

      int greatSum =Integer.MIN_VALUE;
      for (int i = 0; i < a.length-1; i++) {
               if (greatSum < a[i]+a[i+1]){
                  greatSum = a[i]+a[i+1];
               }   
      }
      return greatSum;
   }
}
