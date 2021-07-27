public class SumFactor {

   public static void main(String[] args) {
      
      int[] data = {1,9,3};
      int result = sumFactor(data);
      System.out.println(result);

   }
   private static int sumFactor(int []a){
      int sum = 0,counter=0;
      
      for (int i : a) {
         sum += i;
      }

      for (int i : a) {
         if (sum==i) {
            counter++;
         }
      }

      return counter;
   }
}
