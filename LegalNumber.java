public class LegalNumber {
   public static void main(String[] args) {
      int[] data={1,2,3,4};
      int base= 4;
      int result = isLegalNumber(data,base);
      System.out.println(result);
   }

   private static int isLegalNumber(int[] data, int base) {
      for(int i : data){
         if(i >= base){
         return 0;
         }
      }
      return 1;
   }
}
