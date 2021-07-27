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

   private static int[] doIntegerBasedRounding(int[] n,int r){
      
      if(r<=0 ) return null;
      for (int i = 0; i < n.length; i++) {
         if (n[i] >=0 ) {
            int lowerBound = (n[i]/r)*r;
            int upperBound = lowerBound + r;

            int middle= (n[i]%2 == 0) ? lowerBound + r/2 : lowerBound + r/2+1;

            if(n[i] >= middle) n[i] = upperBound;
            else n[i] = lowerBound; 
         }
       }
       return n;
      }
}
