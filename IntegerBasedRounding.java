import java.util.Arrays;

public class IntegerBasedRounding {
   public static void main(String[] args) {
      
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-18,1, 2, 3, 4, 5}, 4)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5)));
      System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100)));

   }
   private static int[] doIntegerBasedRounding(int []a,int n ){
      if(a.length <2) return null;
      if(n<=0) return a;

      int[] result = new int[a.length];
      for (int i = 0; i < result.length; i++) {
         int rounding = (a[i]/n)*a[i];
         if((a[i]-n) < (a[i]-rounding)){
            result[i]=n;
         }else{
            result[i]=rounding;
            
         }
          
      }
      return result;
   }
}
