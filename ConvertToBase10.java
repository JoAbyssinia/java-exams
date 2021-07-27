public class ConvertToBase10 {
   
   public static void main(String[] args) {
      
      int[] data = {2,2};
      int base =3;

      int result = convertToBase10(data,base);
      System.out.println(result);
   }

   private static int convertToBase10(int[] data, int base) {
      int result=0;
      for (int i : data) {
         if (i>=base) {
            return 0;
         }
      }
      for (int i = 0; i<data.length; i++) {
         int powerResult =1;

         if (i!=0) {
         for (int j = 0; j < i; j++) {
            powerResult *= base;
            }
           
         }          
        result += data[i] * powerResult; 
      }
      return result;
   }
}
