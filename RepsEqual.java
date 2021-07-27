public class RepsEqual1 {
   
   public static void main(String[] args) {
      int[] data = {1,2,3,4,5};
      int d = 12345;

      int result = repsEqual1(data,d);
      System.out.println(result);

   }

   static int repsEqual(int[] data, int d){

      String sd = String.valueOf(d);
      char[] c_arr = sd.toCharArray();
      if (data.length != c_arr.length) {
         return 0;
      }else{
         for (int i = 0; i < data.length; i++) {
            String hd = String.valueOf(c_arr[i]);
            int f = Integer.parseInt(hd);
            if (data[i]!=f) {
               return 0;
            }
         }
      }

      return 1;
   }

   static int repsEqual1(int[] data, int d){
         for (int lastIndex = data.length-1; lastIndex >= 0 ; lastIndex--) {
            int lastDigit = d%10;
            d = d/10;
            if (lastDigit != data[lastIndex] ) {
              return 0;
            }
         }
         return 1;
   }
}
