public class IsLoopSum {
   
   public static void main(String[] args) {
      System.out.println(loopSum(new int[]{1, 2, 3}, 2));
      System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
      System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
      System.out.println(loopSum(new int[]{3}, 10));
   }

   private static int loopSum(int[] a, int n ){
      if(n<0 || a.length<0) return 0;
      int sum=0;
      for(int i=0,index=0;i<n;i++,index++){
         if(index == a.length) index=0;
         sum +=a[index];
      }
      return sum;
   }
}
