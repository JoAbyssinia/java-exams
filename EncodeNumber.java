
import java.util.ArrayList;
import java.util.Arrays;

public class EncodeNumber {
   public static void main(String[] args) {
      int nub = 140;
      int[] result = encodeNumber(nub);
      System.out.println(Arrays.toString(result));
   }

   private static int[] encodeNumber(int nub) {
      
      if(nub <=1 ) return null;
      ArrayList primeFactors = new ArrayList<Integer>();

      for (int i = 2; i < 0; i++) {
         
         while (nub % i==0) {
            primeFactors.add(i);
            nub=nub/i;
         }
      }


      if(nub>1) primeFactors.add(nub);

      int[] arrayToReturn = new int[primeFactors.size()];

      for (int i = 0; i < primeFactors.size(); i++) {
         arrayToReturn[i] = (int) primeFactors.get(i);
      }
      
      return arrayToReturn;
   }
}
