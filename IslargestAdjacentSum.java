public class IslargestAdjacentSum {
   public static void main(String[] args) {
      System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
      System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
      System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
      System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
   }

   private static int largestAdjacentSum(int[] n){
     int sum = Integer.MIN_VALUE;
      for (int i = 0; i < n.length-1; i++) {
         if (sum < (n[i]+n[i+1])) {
            sum = (n[i]+n[i+1]);
         }  
      }
      return sum;
   }
}
