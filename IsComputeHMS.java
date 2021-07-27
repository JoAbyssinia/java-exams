import java.util.Arrays;

public class IsComputeHMS {
   public static void main(String[] args) {
      System.out.println(Arrays.toString(computeHMS(3735)));
      System.out.println(Arrays.toString(computeHMS(380)));
      System.out.println(Arrays.toString(computeHMS(3650)));
      System.out.println(Arrays.toString(computeHMS(55)));
      System.out.println(Arrays.toString(computeHMS(0)));
   }

   private static int[] computeHMS(int n ){
      int[] result = new int[3];
      int hourT = n/3600;
      result[0]=hourT;
      int hourR = n%3600;

      int minT = hourR/60;
      result[1] = minT;

      int minR = hourR%60;

      int sec = minR;
      result [2] = sec;
      
      return result;
   }
}
