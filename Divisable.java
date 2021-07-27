public class Divisable {
   
   public static void main(String[] args) {
      
      int[] data = {24,12,36};
      int d = 12;
      int result = isDivisable(data,d);
      System.out.print(result);
   }

   private static int isDivisable(int[] data, int d) {

      if (data==null) {
         return 1;
      }else{
        
         for (int i = 0; i < data.length; i++) {
            if (data[i]%d != 0) {
             return 0;
            }
         }
            return 1;
      }
   }
}
